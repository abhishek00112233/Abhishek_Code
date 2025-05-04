package LinkList;

public class TargetFindInTwoPair {
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }
        static int targetFind(Node head){
            Node slow=head;
            Node fast=head;
            while (fast.next!=null){
                fast=fast.next;
            }
            Node n=fast;
            while (slow!=null){
                while (fast!=null){
                    if (slow.data+ fast.data==10){
                        return slow.data+(fast.data);
                    }
                    fast=fast.prev;
                }
                fast=n;
                slow=slow.next;
            }
            return -1;
        }
        public static void main(String[] args) {
            Node a=new Node(1);
            Node b=new Node(12);
            Node c=new Node(11);
            Node d=new Node(3);
            Node e=new Node(8);
            Node f=new Node(2);
            a.next=b;
            b.prev=a;
            b.next=c;
            c.prev=d;
            c.next=d;
            d.prev=c;
            d.next=e;
            e.prev=d;
            e.next=f;
            f.prev=e;

            System.out.println(targetFind(a));
        }
    }
}
