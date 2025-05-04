package LinkList;

public class Node1 {
    int data;
    Node1 next;
    Node1(int data){
        this.data=data;
    }
    static class LinkedList{
        Node1 head;
        Node1 tail;

        // add element in LinkedList

        void add(int val){
            Node1 temp=new Node1(val);
            if (head==null || tail==null ){
                head=temp;
            }
            else {
                tail.next=temp;
            }
            tail=temp;
        }
        void display(Node1 head){
            Node1 a=head;
            while (a!=null){
                System.out.print(a.data+" ");
                a=a.next;
                }
            }
            void deleteElement(Node1 head,int idx){
            Node1 n=head;
            for (int i=1;i<=idx;i++){
                n=n.next;
            }
            n.data=n.next.data;
            n.next=n.next.next;
            }

            void Delete(Node1 head){

            }
        public static void main(String[] args) {
            LinkedList ll=new LinkedList();
            ll.add(1);
            ll.add(12);
            ll.add(5);
            ll.add(2);
            ll.add(21);
            ll.deleteElement(ll.head,1);
            ll.display(ll.head);
        }
        }
    }
