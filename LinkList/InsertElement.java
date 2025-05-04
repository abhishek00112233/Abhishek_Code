package LinkList;

public class InsertElement {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
        public static class LinkedList{
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
         void display(){
            Node a=head;
            while (a!=null){
                System.out.print(a.data+" ");
                a=a.next;
            }
        }
        }

        public static void main(String[] args) {
            LinkedList s=new LinkedList();
            s.addElement(12);
            s.addElement(231);
            s.addElement(13);
            s.addElement(15);
            s.addElement(321);
            s.display();

        }
    }
    }