package LinkList;

public class PalindromeLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }

       static class LinkedList{
            Node head;
            Node tail;

            void allElement(int val){
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
           boolean checkPalindrome(){
              Node slow=head;
              Node fast=head;

              while (fast.next!=null && fast.next.next!=null){
                  slow=slow.next;
                  fast=fast.next.next;
              }
              Node right=reverse(slow.next);
              Node left=head;

              while (right !=null && left!=null){
                  if (right.data!= left.data){
                      return false;
                  }
                  right=right.next;
                  left=left.next;
              }
              return true;
           }


           public static void main(String[] args) {
               LinkedList ll=new LinkedList();
               ll.allElement(1);
               ll.allElement(2);
               ll.allElement(2);
               ll.allElement(1);
//               ll.allElement(3);
//               ll.allElement(2);
//               ll.allElement(1);
//               ll.allElement(1);
//               ll.allElement(1);
//               ll.allElement(1);
//               ll.allElement(1);
               ll.display(ll.head);

//              Node n= ll.reverse(ll.head);
               System.out.println(ll.checkPalindrome());



           }
       }
    }
}
