package LinkList;

public class LinkList {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    //linked list print using recursion
    static void displayUsingRecursion(Node r){
        if (r==null){
            return;
        }
        System.out.print(r.data+" ");
        displayUsingRecursion(r.next);
    }
    // linked List print using loop
    static int print(Node temp){
        int count=0;
        while (temp!=null){
//            System.out.print(temp.data+" ");
            count++;
            temp=temp.next;
//        System.out.println(count);
        }
        return count;
    }
    //reverse linked list
    static void reverseLinkedList(Node a){
        if (a==null){
            return;
        }
        reverseLinkedList(a.next);
        System.out.print(a.data+" ");
    }

    // Count length of a linked list
    static int lenCount(Node a){
        int count=0;
        while (a!=null){
            count++;
            a=a.next;
        }
        return count;
    }
    static boolean checkPrime(int a){
        if (a==1){
            return false;
        }
        for (int i=2;i<a;i++){
            if (a%i==0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Node a= new Node(4);
        Node b= new Node(5);
        Node c= new Node(3);
        Node d= new Node(21);
        Node e= new Node(11);
        Node f= new Node(111);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
//        displayUsingRecursion(a);
//        System.out.println();
//        System.out.println(print(a));
//        System.out.println();
//        reverseLinkedList(a);
        System.out.println(lenCount(a));



    }
}