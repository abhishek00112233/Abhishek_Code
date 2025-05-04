package LinkList;

public class DeleteNthNode {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
        static class LinkedList{
            Node head;
            Node tail;
            void add(int val){
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
            void deleteNtElement(Node head,int ele){
                Node slow=head;
                Node fast=head;
                for (int i=1;i<=ele;i++){
                    fast=fast.next;
                }
                while (fast.next!=null){
                    fast=fast.next;
                    slow=slow.next;
                }
                slow.data=slow.next.data;
            }
        }
    }
}