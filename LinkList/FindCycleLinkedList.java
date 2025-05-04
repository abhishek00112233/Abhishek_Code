package LinkList;

import java.util.LinkedHashMap;

public class FindCycleLinkedList {
   static class Node {
       int data;
       Node next;

       Node(int data) {
           this.data = data;
       }

       static class LinkedList {
           Node head = null;
           Node tail = null;

           void add(int val) {
               Node temp = new Node(val);
               if (head == null) {
                   head = temp;
               } else {
                   tail.next = temp;
               }
               tail = temp;
           }

           int size() {
               Node s = head;
               int count = 0;
               while (s != null) {
                   count++;
                   s = s.next;
               }
               return count;
           }

           void display(Node head) {
               Node d = head;
               while (d != null) {
                   System.out.print(d.data + " ");
                   d = d.next;
               }
           }

           // check linked list cycle or not
           boolean cycleLinkedListCheck(Node head) {
               Node slow = head;
               Node fast = head;
               while (fast != null) {
                   if (slow == null) return false;
                   slow = slow.next;
                   if (fast == null) return false;
                   fast = fast.next.next;
                   if (fast == slow) {
                       return true;
                   }
               }
               return false;
           }

           //find cycle Node
           Node findNode(Node head) {
               Node slow = head;
               Node fast = head;
               Node temp=head;
               while (fast!=null){
                   slow=slow.next;
                   fast=fast.next.next;
                   if (slow==fast) break;
               }
               while (temp!=slow){
                   temp= temp.next;
                   slow=slow.next;
               }
               return slow;
           }

       public static void main(String[] args) {
           LinkedList ll = new LinkedList();
           ll.add(2);
           ll.add(4);
           ll.add(5);
           ll.add(7);

           Node a = new Node(2);
           Node b = new Node(5);
           Node c = new Node(24);
           Node d = new Node(22);
           a.next = b;
           b.next = c;
           c.next = d;
           d.next = b;
//              System.out.println(ll.cycleLinkedListCheck(a));
//              ll.display(a);
           Node n=ll.findNode(a);
           System.out.println(n.data);

           LinkedHashMap<Integer,Integer> hs=new LinkedHashMap<>();
       }
   }
      }
   }
