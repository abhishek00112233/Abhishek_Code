package LinkList;

import java.util.IdentityHashMap;

public class GetElementInLinkedList {
   static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }

    }
    static class LinkedList {
        Node head = null;
        Node tail = null;

        void addElement(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        int size() {
            int count = 0;
            Node a = head;
            while (a != null) {
                count++;
                a = a.next;
            }
            return count;
        }

        void getIdx(int idx) {
            int s = size();
            if (idx > s) {
                System.out.println("Out if range ");
                return;
            }
            Node n = head;
            for (int i = 1; i <= idx; i++) {
                n = n.next;
            }
            System.out.println(n.data);
        }

        void deleteIdx(int val) {
            Node m = head;
            for (int i = 1; i < val; i++) {
                m.next = m;
            }
            m.next = m.next.next;

        }
       void display(){
           Node a=head;
           while(a!=null){
               System.out.print(a.data+" ");
               a=a.next;
           }
       }

        public static void main(String[] args) {
            LinkedList ll = new LinkedList();
            ll.addElement(2);
            ll.addElement(5);
            ll.addElement(8);
            ll.display();
//            ll.getIdx(1);
//            ll.deleteIdx(2);
//            ll.display();

    }
    }
//    }
}