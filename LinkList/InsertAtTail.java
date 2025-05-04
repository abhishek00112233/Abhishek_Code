package LinkList;

public class InsertAtTail {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
        static  Node addAtTail( Node head ,int x){
            Node n=head;
            while (n.next!=null){
                n=n.next;
            }
            Node m=new Node(x);
            m.next=n;
            m=n;

            return m;

        }
        static void display(Node head){
            Node n=head;
            while (n!=null){
                System.out.print(n.data+" ");
                n=n.next;
            }
        }
        public static void main(String[] args) {

            Node a=new Node(1);
            Node b=new Node(2);
            Node c=new Node(4);
            a.next=b;
            b.next=c;

           Node n= addAtTail(a,12);
//            addAtTail(a,125);
            display(a);
        }
    }
}
