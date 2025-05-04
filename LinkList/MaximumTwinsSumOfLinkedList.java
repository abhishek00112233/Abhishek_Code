package LinkList;

import java.util.HashSet;

public class MaximumTwinsSumOfLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
        static class LinkedList{
            Node head;
            Node tail;

            void addElement(int val){
                Node temp=new Node(val);
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
            Node reverse(Node head){
                Node curr=head;
                Node prev=null;
                Node Next=null;

                while (curr!=null){
                    Next=curr.next;
                    curr.next=prev;
                    prev=curr;
                    curr=Next;
                }
                return prev;
            }

            public static void main(String[] args) {
                LinkedList ll=new LinkedList();
                ll.addElement(1);
                ll.addElement(3);
                ll.addElement(4);
                ll.addElement(5);
                ll.addElement(6);
                ll.addElement(7);
                ll.addElement(8);
                ll.addElement(33);

                Node slow=ll.head;
                Node fast=ll.head;
                while (fast.next!=null && fast.next.next!=null){
                    slow=slow.next;
                    fast=fast.next.next;
                }
                Node p1=ll.reverse(slow.next);
                Node p2= ll.head;
                int sum=0;
                while (p1!=null && p2!=null){
                    if (p1.data+p2.data>=sum){
                        sum=p1.data+p2.data;
                    }
                    p1=p1.next;
                    p2=p2.next;
                }
                System.out.println(sum);
            }
        }
    }
}
