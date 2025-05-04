package LinkList;

public class MergeTwoSortedLinkedList {
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
        }
            public static void main(String[] args) {
            LinkedList ll=new LinkedList();
                Node a = new Node(12);
                Node b = new Node(14);
                Node c = new Node(18);
                Node d = new Node(19);
                a.next = b;
                b.next = c;
                c.next = d;

//                while (a != null) {
//                    System.out.print(a.data + " ");
//                    a = a.next;
//                }
                System.out.println();


                Node s1 = new Node(2);
                Node s2 = new Node(15);
                Node s3 = new Node(17);
                Node s4 = new Node(18);
//                Node s5 = new Node(20);
                s1.next = s2;
                s2.next = s3;
                s3.next = s4;
//                s4.next=s5;

//                while (s1 != null) {
//                    System.out.print(s1.data + " ");
//                    s1 = s1.next;
//                }
                while (s1!=null && a!=null){
                    if (s1.data<a.data){
                        ll.add(s1.data);
                        s1=s1.next;
                    }
                    else {
                        ll.add(a.data);
                        a=a.next;
                    }
                }
                while (s1!=null){
                    ll.add(s1.data);
                    s1=s1.next;
                }
                while (a!=null){
                    ll.add(a.data);
                    a=a.next;
                }
                Node n= ll.head;
                while(n!=null){
                    System.out.print(n.data+" ");
                    n=n.next;
                }

                int n1=10;
                int n2=20;
               n1=n1^n2;
               n2=n2^n1;
               n1=n1^n2;
                System.out.println();
                System.out.println(n1);
                System.out.println(n2);

                System.out.println(~-321);

            }
    }
}
