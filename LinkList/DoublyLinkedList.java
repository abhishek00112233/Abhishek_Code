package LinkList;

public class DoublyLinkedList {
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }

       static void display(Node head){
            Node n=head;
            while (n!=null){
                System.out.print(n.data+" ");
                n=n.next;
            }
        }
        static void reverseDisplay(Node head){
            Node n=head;
            while (n!=null){
                System.out.print(n.data+" ");
                n=n.prev;
            }
        }
        static void insertAtTail(Node head, int val){
            Node temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            Node t=new Node(val);
            temp.next=t;
            t.prev=temp;
        }
        static Node addAtHead(Node head,int val){
           Node t=new Node(val);
           t.next=head;
           head.prev=t;
           head=t;
           return head;
        }
        public static void main(String[] args) {
            Node a=new Node(1);
//            Node b=new Node(2);
//            Node c=new Node(3);
//            Node d=new Node(4);
//            Node e=new Node(5);
//            Node f=new Node(6);
//            a.next=b;
//            b.prev=a;
//            b.next=c;
//            c.prev=b;
//            c.next=d;
//            d.prev=c;
//            d.next=e;
//            e.prev=d;
//            e.next=f;
//            f.prev=e;

            display(a);
            System.out.println();
//            reverseDisplay(f);
            insertAtTail(a,112);
            insertAtTail(a,113);
            insertAtTail(a,114);
           Node n= addAtHead(a,12);
            display(n);
            System.out.println();
            display(a);
            System.out.println();


        }
    }
}
