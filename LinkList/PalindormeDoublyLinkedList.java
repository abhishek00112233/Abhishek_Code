package LinkList;

public class PalindormeDoublyLinkedList {
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }
       static Node reverse(Node head){
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
       static boolean palindrome(Node head){
//            Node slow=head;
//            Node fast=head;
//            while (fast.next!=null && fast.next.next!=null){
//                slow=slow.next;
//                fast=fast.next.next;
//           }
//            Node p1=reverse(slow.next);
//            Node p2=head;
//            while(p1!=null && p2!=null){
//                if (p1.data!=p2.data){
//                    return false;
//                }
//                p1=p1.next;
//                p2=p2.next;
//            }
//            return true;

           Node slow=head;
           Node fast=head;

           while (fast.next!=null){
               fast=fast.next;
           }
           while (slow!=null && fast!=null){
               if (slow.data!=fast.data){
                   return false;
               }
               slow=slow.next;
               fast=fast.prev;
           }
           return true;
           }
        public static void main(String[] args) {
            Node a=new Node(1);
            Node b=new Node(2);
            Node c=new Node(1);
//            Node d=new Node(1);
            a.next=b;
            b.prev=a;
            b.next=c;
            c.prev=b;
//            c.next=d;
//            d.prev=c;
//            System.out.println(palindrome(a));
            System.out.println(palindrome(a));

        }
    }
}
