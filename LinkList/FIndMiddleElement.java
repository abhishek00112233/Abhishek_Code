package LinkList;

public class FIndMiddleElement {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
        public static class LinkedList{
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
                Node a=head;
                while (a!=null){
                    System.out.print(a.data+" ");
                    a=a.next;
                }
            }
            int size(){
                int count=0;
                Node n=head;
                while (n!=null){
                    count++;
                    n=n.next;
                }
                return count;
            }

            //Find middle element LinkedList
            void findMiddle(Node head){
                Node f=head;
                int s=0;
                if (size()%2==0){
                    s=(size()/2)-1;
                }
                else {
                    s=size()/2;
                }
                for (int i=1;i<=s;i++){
                    f=f.next;
                }
                System.out.println(f.data);
            }

            // find middle in 2nd way
            void findMiddle2(Node head){
                Node slow=head;
                Node fast=head;
                while (fast!=null && fast.next!=null && fast.next.next!=null){
                    slow=slow.next;
                    fast=fast.next.next;
                }
                System.out.println(slow.data);
            }
            Node deleteMiddleElement(Node head){
                Node slow=head;
                Node fast=head;
                if (fast.next==null){
                    return null;
                }
                while (fast.next.next!=null && fast.next.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
                return head;
            }

            public static void main(String[] args) {
                LinkedList ll=new LinkedList();
                ll.addElement(1);
                ll.addElement(2);
//                ll.addElement(3);
//                ll.addElement(4);
//                ll.addElement(12);
//                ll.addElement(10);
//                ll.findMiddle(ll.head);
//                ll.findMiddle2(ll.head);
                Node n=ll.deleteMiddleElement(ll.head);

                ll.display(n);
            }
        }
    }
}
