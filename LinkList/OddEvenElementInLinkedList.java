package LinkList;

import java.util.EventListener;

public class OddEvenElementInLinkedList {
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
        }
        static class LinkedList {
            Node head;
            Node tail;

            void addElement(int val) {
                Node temp = new Node(val);
                if (head==null){
                    head=temp;
                }
                else {
                    tail.next=temp;
                }
                tail=temp;
            }
            void display(Node head){
                Node n=head;
                while (n!=null){
                    System.out.print(n.data+" ");
                    n=n.next;
                }
            }

            public static void main(String[] args) {

                Node odd=new Node(0);
                Node o=odd;
                Node even=new Node(0);
                Node e=even;
                LinkedList ll=new LinkedList();
                ll.addElement(17);
                ll.addElement(15);
                ll.addElement(8);
                ll.addElement(9);
                ll.addElement(2);
                ll.addElement(4);
                ll.addElement(6);
//                ll.addElement(27);
//                ll.addElement(23);
                while (ll.head!=null){
                   int n=ll.head.data;
                   if (n%2==0) {
//                       System.out.print(n+" ");
                       Node a=new Node(n);
                       e.next=a;
                       e=a;
                       ll.head=ll.head.next;

                   }

                    else if (n%2!=0) {
                       Node x=new Node(n);
                       o.next=x;
                       o=x;
                    ll.head=ll.head.next;
                   }
                }

//                even.next=odd;
                Node l= even;
                while (l.next!=null){
                    l=l.next;
                }
                l.next=odd.next;
                ll.display(even.next);
//                System.out.println();
//                ll.display(odd.next);
//                System.out.println();
            }
        }
    }
}