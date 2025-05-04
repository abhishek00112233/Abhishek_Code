package LinkList;//package LinkList;
//     class NOde {
//        int data;
//        NOde next;
//
//        NOde(int data) {
//            this.data = data;
//        }
////        static class LinkedList{
////            Node head=null;
////            Node tail=null;
////
////            void addElement(int val){
////                Node temp=new Node(val);
////                if (head==null){
////                    head=temp;
////                }
////                else {
////                    tail.next=temp;
////                }
////                tail=temp;
////            }
////            void display(Node head){
////                Node a=head;
////                while (a!=null){
////                    System.out.print(a.data+" ");
////                    a=a.next;
////                }
////           }
////    }
//            public static void main(String[] args) {
////                LinkedList ll=new LinkedList();
////                ll.addElement(1);;
////                ll.addElement(2);;
////                ll.addElement(17);
////                ll.display(ll.head);
////            }
//                NOde a = new NOde(1);
//                NOde b = new NOde(28);
//                NOde c = new NOde(10);
//                a.next = b;
//                b.next = c;
//
//                while (a != null) {
//                    System.out.print(a.data + " ");
//                    a = a.next;
//                }
//
//    }
//}

public class SinglyLinkedList{

}
 class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }

     public static void main(String[] args) {
         Node a=new Node(1);
         Node b=new Node(3);
         Node c=new Node(2);
         Node d=new Node(9);

         a.next=b;
         b.next=c;
         c.next=d;

         System.out.println(a.next.next.data);
//         Node a=new Node();
//         a.data=10;
//         Node b=new Node();
//         b.data=12;
//         Node c=new Node();
//         c.data=21;
//
//         a.next=b;
//         b.next=c;


         //delete Element
//         Node n=a;
//         while (n.next.next!=null){
//             n=n.next;
//         }
//         n.next=null;
//
//
//
//         while (a!=null){
//             System.out.print(a.data+" ");
//             a=a.next;
//         }
     }
}

