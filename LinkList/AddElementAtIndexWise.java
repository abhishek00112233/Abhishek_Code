package LinkList;

public class AddElementAtIndexWise {
    static class Node{
        int data;
        Node next;
        int index;
        Node(int data,int index){
            this.data=data;
            this.index=index;
        }
        public static class LinkedList{
            Node head=null;
            Node tail=null;
            void addElementAtIndexWise(int index,int val){
                Node temp=new Node(index,val);
                if (head==null){
                    head=temp;
                }
                else if (tail==null){
                }
                else{
                    tail.next=temp;
                }
                tail=temp;
            }
        }
    }
}
