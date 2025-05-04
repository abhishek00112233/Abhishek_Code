package LinkList;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.util.Scanner;

public class InsertElementLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
        static class LinkedList{
            Node head=null;
            Node tail=null;
            void addElement(int val){
                Node temp=new Node(val);
                if (tail==null){
                    head =temp;
                }
                else {
                    tail.next=temp;
                }
                tail=temp;
            }
            //Insert element at startIndex
            void addSt(int val){
                Node temp=new Node(val);
                if (head==null){
                    head=temp;
                    tail=temp;
                }
                else{
                    temp.next=head;
                    head=temp;
                }
            }
            void display(){
                Node n=head;
                while (n!=null){
                    System.out.print(n.data+" ");
                    n=n.next;
                }
            }
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            LinkedList ll=new LinkedList();
//            ll.addElement(12);
//            ll.addElement(3);
//            ll.addElement(12);
//            ll.addElement(4);
//            ll.display();
            System.out.println("enter input number ");
            int n=sc.nextInt();
            for (int i=1;i<=n;i++){
                System.out.println("Enter element of Linked List");
                ll.addSt(sc.nextInt());
            }
            ll.display();
        }
    }
}
