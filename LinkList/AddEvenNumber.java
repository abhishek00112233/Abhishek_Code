package LinkList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AddEvenNumber {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
       static int size(Node head){
            int count=0;
            Node m=head.next;
            while (m!=null){
                count++;
                m=m.next;
            }
            return count;
        }
        static boolean palindromeCheck(ArrayList<Integer> num){
            int st=0;
            int end=num.size()-1;
            while (st<end){
                if (num.get(st)!=num.get(end)){
                    return false;
                }
                st++;
                end--;
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("how many times you will need to take input  : ");
            int m=sc.nextInt();
            Node Even=new Node(0);
            Node e=Even;
            for (int i=1;i<=m;i++) {
                System.out.println("Enter input : "+i);
                int n=sc.nextInt();
                if (n % 2 == 0) {
                    Node a = new Node(n);
                    e.next = a;
                    e = a;
                }
            }

//           int x= Even.next.data;
//            int x2=Even.next.next.data;
//            Even.next.data=x2;
//            Even.next.next.data=x;

            Node p=Even.next;
            while (p!=null){
                System.out.print(p.data+" ");
                p=p.next;
            }
           // size find
            int s=0;
            Node a=Even.next;
            while (a!=null){
                s++;
                a=a.next;
            }
            int x3=s/2;
            while (x3>0){
                int x= Even.next.data;
                 int x2=Even.next.next.data;
                 Even.next.data=x2;
                 Even.next.next.data=x;
                 x3--;

            ArrayList<Integer> num=new ArrayList<>();
                num.add(1);
                num.add(3);
                num.add(5);
                num.add(3);
                num.add(1);
                System.out.println(palindromeCheck(num));
            }

        }
    }
}
