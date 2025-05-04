package LinkList;

public class RemoveDuplicate {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        static class LinkedList {
            Node head;
            Node tail;

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
                Node n = head;
                while (n != null) {
                    System.out.print(n.data + " ");
                    n = n.next;
                }
            }

            //Remove duplicate
            Node remDuplicate(Node head) {
                LinkedList ll = new LinkedList();
                Node slow = head;
                Node fast = head.next;
                Node n = new Node(0);
                Node a = n;
                int s1 = 0;
                int s2 = 0;
                while (fast != null) {
                    s1 = slow.data;
                    s2 = fast.data;
                    if (s1 != s2) {
                        Node x = new Node(s2);
                        a.next = x;
                        a = x;
                    }
                    slow = slow.next;
                    fast = fast.next;
                }
                return n;
            }
            void reverseLL(Node head){
                Node n=new Node(0);
                Node n2=n;

                if (head==null){
                    return;
                }
                reverseLL(head.next);
               int x=(head.data);
               Node a=new Node(x);
                n2.next=a;
                n2=a;

            }

            public static void main(String[] args) {
                LinkedList ll = new LinkedList();
                ll.addElement(1);
                ll.addElement(1);
                ll.addElement(1);
                ll.addElement(1);
                ll.addElement(2);
                ll.addElement(3);
                ll.addElement(3);
                ll.addElement(3);
                ll.addElement(4);
                ll.addElement(4);
                ll.addElement(5);
                ll.addElement(1);
                ll.addElement(1);
//                ll.addElement(5);
//                ll.addElement(9);
//                ll.addElement(9);
//                ll.addElement(19);

//                Node m=ll.remDuplicate(ll.head);
//                System.out.println(m.data);
//                System.out.println(m.next.data);
//                ll.display(m.next);
                ll.display(ll.head);
                System.out.println();
                ll.reverseLL(ll.head);
            }
        }
    }}
