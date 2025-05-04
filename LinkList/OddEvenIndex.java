package LinkList;

public class OddEvenIndex {
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

             public static void main(String[] args) {
                 LinkedList ll=new LinkedList();
                 ll.addElement(17);
                 ll.addElement(15);
                 ll.addElement(8);
                 ll.addElement(9);
                 ll.addElement(2);
                 ll.addElement(4);
                 ll.addElement(6);
                 ll.display(ll.head);

                 Node Even=new Node(0);
                 Node e=Even;
                 Node Odd=new Node(0);
                 Node o=Odd;

                 Node l= ll.head;
                 int i=1;
                 while (l!=null){
                     if (i%2==0){
                         Node a=new Node(l.data);
                         e.next=a;
                         e=a;
                         i++;
                     }
                     else {
                         Node b=new Node(l.data);
                         o.next=b;
                         o=b;
                         i++;
                     }
                     l=l.next;
                 }
                 System.out.println();
                 Node n=Even;
                 while (n.next!=null){
                     n=n.next;
                 }
                 n.next=Odd.next;

//                 Even.next=Odd.next;
                 ll.display(Even.next);
//                 ll.display(Even.next);
//                 System.out.println();
//                 ll.display(Odd.next);
             }
         }
    }
}
