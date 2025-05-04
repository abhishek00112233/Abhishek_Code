package LinkList;

public class DeleteNodeElement {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static class LinkedList2{
        Node head=null;
        Node tail=null;
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
        void display( Node head){
            Node s=head;
            while (s!=null){
                System.out.print(s.data+" ");
                    s=s.next;
            }
        }
       static int size(Node head){
            int count=0;
            Node n=head;
            while (n!=null){
                count++;
                n=n.next;
            }
            return count;
        }
        Node ntNode(Node head,int ele){
            Node fast=head;
            Node slow=head;
            for (int i=1;i<=ele;i++){
                fast=fast.next;
            }
            while (fast!=null){
                slow=slow.next;
                fast=fast.next;
            }
            return slow;
        }
        // remove nth node form a linked list
        static void deleteNthNode(Node head,int n) {
            Node fast = head;
            Node slow = head;
//            if (n==size(head)){
//                slow.data=slow.next.data;
//                slow.next=slow.next.next;
//                return;
//            }
            for (int i = 0; i < n; i++) {
                fast = fast.next;
            }
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = slow.next.next;
        }
        public static void main(String[] args) {
            LinkedList2 ll=new LinkedList2();
            ll.addElement(2);
            ll.addElement(4);
            ll.addElement(9);
            ll.addElement(19);
            ll.addElement(12);
            ll.addElement(21);
//           Node n=ll.ntNode(ll.head,2);
//            System.out.println(n.data);
            deleteNthNode(ll.head,1);
           ll.display(ll.head);
        }
    }
}
