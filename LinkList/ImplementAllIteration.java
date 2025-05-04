package LinkList;

import java.util.ArrayList;

public class ImplementAllIteration {
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
            void display(Node head) {
                Node a = head;
                while (a != null) {
                    System.out.print(a.data + " ");
                    a = a.next;
                }
            }
            void deleteElement(int idx){
                Node fast=head;
                for (int i=1;i<=idx;i++){
                    fast=fast.next;
                }
                fast.data=fast.next.data;
                fast.next=fast.next.next;
                }

                int getIndex(int idx){
                int n=0;
                Node fast=head;
                while (fast!=null){
                    if (fast.data==idx){
                        return n;
                    }
                    fast=fast.next;
                    n++;
                }
                return -1;
                }

                void reverseDisplay(Node head){
                    ArrayList<Integer> num=new ArrayList();
                Node n=head;
                if (n==null){
                    return;
                }
                reverseDisplay(n.next);
                num.add(n.data);
                }
                void middleFind(Node head){
                    Node slow=head;
                    Node fast=head;

                    while (fast.next!=null ){
                        fast=fast.next.next;
                        slow=slow.next;
                    }
                    System.out.println(slow.data);

                }

    public static void main(String[] args) {
                LinkedList ll=new LinkedList();
                ll.addElement(1);
                ll.addElement(12);
                ll.addElement(3);
                ll.addElement(13);
                ll.addElement(23);
                ll.addElement(223);
                ll.addElement(233);
//                ll.display(ll.head);
//        ll.deleteElement(5);
//              ll.display(ll.head);
//        System.out.println();
//        System.out.println(ll.getIndex(23));
//        System.out.println();
//        ll.reverseDisplay(ll.head);
        ll.middleFind(ll.head);

    }
    }

    }
}
