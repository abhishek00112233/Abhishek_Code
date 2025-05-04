package LinkList;

public class CycleLinkedList {
    static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
        }

        static class LinkedList01 {
            Node head = null;
            Node tail = null;

            void addElement(int val) {
                Node temp = new Node(val);
                if (head == null) {
                    head = temp;
                } else {
                    tail.next = temp;
                }
                tail = temp;
            }

            void display(Node head) {
                Node a = head;
                while (a != null) {
                    System.out.print(a.data + " ");
                    a = a.next;
                }
            }


            boolean cycleLinkedList(Node head) {
                Node slow = head;
                Node fast = head;
                if (fast == null) return false;
                else if (fast.next == null) return false;
                while (fast != null) {
                    slow = slow.next;
                    fast = fast.next;
                    if (slow == fast) {
                        return true;
                    }
                }
                return false;
            }
        }

            public static void main(String[] args) {
                LinkedList01 ll = new LinkedList01();
//            ll.addElement(2);
//            ll.addElement(3);
//            ll.addElement(4);
//            ll.addElement(5);
//            ll.display(ll.head);
                Node a = new Node(1);
                Node b = new Node(1);
                Node c = new Node(1);
                Node d = new Node(1);
                Node e = new Node(1);
                a.next = b;
                b.next = c;
                c.next = d;
                d.next = e;
//                e.next = b;
                System.out.println(ll.cycleLinkedList(a));

        }
    }
}