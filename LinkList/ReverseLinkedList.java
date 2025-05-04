package LinkList;

public class ReverseLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        static class LinkedList {
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
                Node n = head;
                while (n != null) {
                    System.out.print(n.data + " ");
                    n = n.next;
                }
            }

            Node reverse(Node head){
                Node curr=head;
                Node prev=null;
                Node Next=null;

//                Next=curr.next;
                while (curr!=null){
                    Next=curr.next;
                    curr.next=prev;
                    prev=curr;
                    curr=Next;

//                    Next=Next.next;
                }
                return prev;
            }
        public static void main(String[] args) {
            LinkedList ll=new LinkedList();
            ll.addElement(11);
            ll.addElement(12);
            ll.addElement(13);
            ll.addElement(14);
            ll.addElement(15);
            ll.addElement(16);
            ll.display(ll.head);
            System.out.println();
//            Node a = new Node(12);
//            Node b = new Node(13);
//            Node c = new Node(14);
//            Node d = new Node(15);
//            Node e = new Node(16);
//
//            a.next = b;
//            b.next = c;
//            c.next = d;
//            d.next = e;
          Node n=  ll.reverse(ll.head);
          ll.display(n);



        }

        }
    }
}
