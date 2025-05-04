package LinkList;

public class DuplicateRemove {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }

        static class LinkedList{
            Node head;
            Node tail;

            void display( Node head){
                Node a=head;
                while (a!=null){
                    System.out.print(a.data+" ");
                    a=a.next;
                }
            }
            void removeDuplicate(Node head){
                Node n=head;
                while (n.next!=null){
                    Node m=head;
                    while (m.next!=null){
                        if (n.data==m.data){
                            n.data=n.next.data;
                        }
                        m=m.next;
                    }
                    n=n.next;
                }
            }

            public static void main(String[] args) {
                Node a=new Node(12);
                Node b=new Node(122);
                Node c=new Node(132);
                Node d=new Node(12);
                a.next=b;
                b.next=c;
                c.next=d;

                LinkedList ll=new LinkedList();
                ll.removeDuplicate(a);
                ll.display(a);


            }
        }
    }
}
