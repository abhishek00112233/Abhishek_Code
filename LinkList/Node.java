//package LinkList;
//
//public class Node {
//    int data;
//    NOde next;
//    Node(int data){
//        this.data=data;
//    }
//    static class LinkedList{
//        NOde head=null;
//        NOde tail=null;
//        void addElement(int val){
//            NOde temp=new NOde(val);
//            if (head==null){
//                head=temp;
//            }
//            else {
//                tail.next=temp;
//            }
//            tail=temp;
//        }
//        int size(){
//            int count=0;
//            NOde s=head;
//            while (s!=null){
//                count++;
//                s=s.next;
//            }
//            return (count);
//        }
//        void getInx(int inx,int val){
//            NOde i=head;
//            for (int j=1;j< i.data;j++){
//                i=i.next;
//            }
//
//
//        }
//        void delete(int idx){
//            NOde d=head;
//            for (int i=1;i<idx;i++){
//                d=d.next;
//            }
//            d.next=d.next.next;
//        }
//
////        void display(){
////            Node n=head;
////            while (n!=null){
////                System.out.print(n.data+" ");
////                n=n.next;
////            }
////        }
//
//        public static void main(String[] args) {
//            LinkedList ll=new LinkedList();
//            ll.addElement(1);
//            ll.addElement(7);
//            ll.addElement(17);
//            ll.addElement(90);
//            ll.addElement(3);
////            ll.delete(2);
////            ll.delete(1);
//
////            ll.display();
//            ll.size();
//        }
//    }
//}
