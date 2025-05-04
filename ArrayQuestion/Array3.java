package ArrayQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {
    //create a array and sum of all element
    static int[] arraySum(int[] arr){
        Scanner sc=new Scanner(System.in);
        int count=0;
        for (int i=0;i<arr.length;i++){
            count+=arr[i];
        }
        System.out.println("Total sum of array = "+count);
        return arr;

    }
    // ArrayQuestion.Array2.Array reverse
    static void revArray(int[] arr){
        int n=0;
        int m=arr.length-1;
        while (n<m){
            int temp=arr[n];
            arr[n]=arr[m];
            arr[m]=temp;
            n++;
            m--;
        }
        for (int i:arr){
            System.out.print(i+" ");
        }
    }

    // rotate array
    static int[] reverseArray(int[] arr,int x,int y){
        while (x<y){
            int temp=arr[x];
            arr[x]=arr[y];
            arr[y]=temp;
            x++;
            y--;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    //check at least one greater then itself
    static int[] graterNumberCount(int[] arr){
        int max=arr[0];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
//                count=i;
            }
            System.out.println(count);
        }
            return arr;
    }

    // target check in ArrayQuestion.Array2.Array
    static boolean sumCheck(int[] arr,int target){
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==target){
                    return true;
                }
            }
        }
            return false;
    }

    // first and last occur find
//    static int[] firstLastOccur(int[] arr, int target){
//        int st=0;
//        int end=arr.length-1;
//        int ans =-1;
//        while (st<=end){
//            int mid=st+(end-st);
//            if (arr[mid]==target){
//                ans=mid;
//
//            } else if (arr[mid]>target) {
//
//            }
//        }
//    }

    // find last position given array
    static int findPosition(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        int f;
        while (left<=right){
            int mid=left+(right-left)/2;
            if (arr[mid]==target){
                f=mid;
                mid=right-1;

            }
            else if (arr[mid]<target){
                mid=left+1;
            }
            else mid=right-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,6,7,8,9,44,321};
        int target=6;
        System.out.println(findPosition(arr,target));
//        int[] arr=new int[5];
//        for (int i=0;i<arr.length;i++){
//        System.out.println("Enter value of array : ");
//        arr[i]=sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//        arraySum(arr);


        // find ArrayQuestion.Array2.Array mix value
//        int[] arr={-10,-20,-30,-40};
//        int min=Integer.MIN_VALUE;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]>min){
//                min=arr[i];
//            }
//        }
//        System.out.println(min);

        // swap 2 variable
//        int a=10;
//        int b=20;
//        int temp=a;
//        a=b;
//        b=temp;
//        System.out.println("After swap");
//        System.out.println("a = "+a);
//        System.out.println("b = "+b);

        // swap array element
//        int[] arr={10,20,30,40,50};
//        int[] arr1=new int[arr.length];
//        int k=0;
//        for (int i=0;i<arr.length;i++){
//            arr1[k]=arr[i];
//            k++;
//        }
//        int n=arr.length-1;
//        for (int i=0;i<arr.length;i++){
//            arr[i]=arr1[n];
//            n--;
//            }
//        System.out.println(Arrays.toString(arr));


//        int[] arr={10,20,30,40,50,60};
//        int n=0;
//        int m=arr.length-1;
//        while(n<m){
//        int temp=arr[n];
//        arr[n]=arr[m];
//        arr[m]=temp;
//        n++;
//        m--;
//        }
////        System.out.println(Arrays.toString(arr));
//        for (int i:arr){
//            System.out.print(i+" ");
//        }


//        int[] arr={2,3,4,5};
//        revArray(arr);


//
//        //reverse array in user decide first index and last index
//
//        System.out.println("Enter length of array : ");
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        for (int i=0;i<arr.length;i++){
//            System.out.println("Enter element of array : ");
//            arr[i]=sc.nextInt();
//        }
//        System.out.println("Enter start number to swap : ");
//        int n1=sc.nextInt();
//        System.out.println("Enter end number to swap : ");
//        int n2=sc.nextInt();
//        System.out.println("Before swap");
//        System.out.println(Arrays.toString(arr));
//        while (n1<n2){
//            int temp=arr[n1];
//            arr[n1]=arr[n2];
//            arr[n2]=temp;
//            n1++;
//            n2--;
//        }
//        System.out.println("After swap");
//        System.out.println(Arrays.toString(arr));


        // Rotate ArrayQuestion.Array2.Array


//        int k=5;
//        int x1=k;
//        int[] arr={4,1,6,9,2,14,7,8,3};
//        System.out.println(Arrays.toString(arr));
//        int n=0;
//        int m=arr.length-1;
//        while (n<m){
//            int temp=arr[n];
//            arr[n]=arr[m];
//            arr[m]=temp;
//            n++;
//            m--;
//        }
//        System.out.println(Arrays.toString(arr));
//        int s=0;
//        while (s<=k){
//            int temp=arr[s];
//            arr[s]=arr[k];
//            arr[k]=temp;
//            s++;
//            k--;
//        }
////        System.out.println(Arrays.toString(arr));
//
//        int x2=arr.length-1;
//        while (x1<x2){
//            int temp=arr[x1];
//            arr[x1]=arr[x2];
//            arr[x2]=temp;
//            x1++;
//            x2--;
//        }
//        System.out.println(Arrays.toString(arr));


//        int[] arr={1,2,3,4,5,6,7};
//        int k=3;
//        // part 1
//        revarraytoRotate(arr,0,arr.length-k);
//        // part 2
//        revarraytoRotate(arr,arr.length-k,arr.length-1);
//
//        // part3 array reverse
//        revarraytoRotate(arr,0,arr.length-1);
//


//        int[] arr={1,2,3,4,5,6,7};
//        System.out.println(Arrays.toString(arr));
//        int k=3;
//        int n1=0;
//        int n2=arr.length-1;
//        while (n1<n2){
//            int temp=arr[n1];
//            arr[n1]=arr[n2];
//            arr[n2]=temp;
//            n1++;
//            n2--;
//        }
//        System.out.println(Arrays.toString(arr));
//        int x1=0;
//        int x2=arr.length-k;
//        while (x1<x2){
//            int temp=arr[x1];
//            arr[x1]=arr[x2];
//            arr[x2]=temp;
//            x1++;
//            x2--;
//        }
//        System.out.println(Arrays.toString(arr));
//        int m1=arr.length-k;
//        int m2=arr.length-1;
//        while (m1<m2){
//            int temp=arr[m1];
//            arr[m1]=arr[m2];
//            arr[m2]=temp;
//            m1++;
//            m2--;
//        }
//        System.out.println(Arrays.toString(arr));


//        int[] arr={1,2,3,5,6};
//        int k=2;
//        k%=arr.length;
//
//        reverseArray(arr,0,arr.length-1);
//        reverseArray(arr,0,k-1);
//        reverseArray(arr,arr.length-k-1,arr.length-1);
//        reverseArray(arr,0,arr.length-1-k);
//        reverseArray(arr,arr.length-k,arr.length-1);
//        System.out.println(Arrays.toString(arr));

//        int[] arr = {-4,-3,7,9,3,9,4};
//        int max=Integer.MIN_VALUE;
//        int count=0;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]>max){
//                max=arr[i];
//            }
//        }
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]<max){
//                count++;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println("length of array : "+arr.length);
//        System.out.println(count);

//        int[] arr={1,2,3,4,5,6};
//        int target=8;
//        System.out.println(sumCheck(arr,target));

        // find second largest
//        int[] arr={8,90,5,44,65,90};
//        int max=arr[0];
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]>max){
//                max=arr[i];
//            }
//        }
//        int sl=arr[0];
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]>sl && arr[i]<max){
//                sl=arr[i];
//            }
//        }
//        System.out.println(sl);


        // Binary search  Two pointer approach

//        int arr[]={12,11,7,8,3};
//        int target=12 ;
//       int ans=-1;
//       int st=0;
//       int end=arr.length-1;
//       while (st<=end){
//           int mid=st+(end-st)/2;
//           if (arr[mid]==target){
//               ans=mid;
//               break;
//           } else if (arr[mid]<target) {
//               end--;
//           }else
//               st++;
//       }
//        System.out.println(ans);

//        int[] arr={1,2,3,4,6};
//        int element=11;
//        int pos=3;
//        for (int i=pos;i<=pos;i++){
//                arr[i]=element;
//            }
//        System.out.println(Arrays.toString(arr));


        //Find first index of this element
//
//        int[] arr={2,2,4,4,4,8,12,16};
//        int target=4;
//        int left=0;
//        int right=arr.length-1;
//        int ans=-1;
//        while (left<=right){
//            int mid=left+(right-left)/2;
//            if (arr[mid]==target){
//                ans=mid;
//                if(arr[mid]>target){
//                    left=mid+1;
//                }
//                else
//                    right=mid-1;
//            } else if (arr[mid]>target) {
//                left=mid-1;
//            }
//            else
//                right=mid+1;
//        }
////        if (ans==-1){
////            System.out.println(-1);
////        }
////        else System.out.println(ans);
//        System.out.println(ans);


//        int[] arr={2,2,4,4,4,8,12,16,4,4};
//        int target=4;
//        int n1=0;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]==target){
//                n1++;
//            }
//        }
//        int arr1[]=new int[n1];
//        int n=0;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]==target){
//                arr1[n]=i;
//                n++;
//            }
//        }
//        System.out.println(Arrays.toString(arr1));


//        int[] arr={2,3,1,4,0,5,4,1,3,2};
//        int target=5;
//        int x=0;
//
////        int[][] arr2=new int[x2][2];
//        for (int i=0;i<arr.length;i++){
//            for (int j=i+1;j<arr.length;j++){
//                if (arr[i]+arr[j]==target){
//                    System.out.println(i+" "+j);
//
////                    System.out.println(Arrays.toString(arr3));
////                    System.out.println(Arrays.toString(arr3));
//                }
//            }
//        }
//        for (int []i:arr2){
//            for (int j:i){
//                System.out.print(j);
//            }
//            System.out.println();


//        int[] arr={10,20,40,50,60,80,90};
//        int target=30;
//        int st=0;
//        int end=arr.length-1;
        }

    public static class ArrayQuestion {
        // Digit frequency in array
        static int [] digitCount(int []arr,int target){
            int count=0;
            for (int i=0;i<arr.length;i++)
                if (arr[i]==target){
                    count+=1;
                }
            System.out.println("target = "+target);
            System.out.println(count);
            return arr;

        }
        public static void main(String[] args) {
            int arr[]={2,3,4,5,6,7,3,4,54,3,2,4,5,5,4,3,3,};
            digitCount(arr,3);

        }
    }

    public static class PeakElement {
        //peak element
        static int peakElementFind(int[] arr){
            int ans=0;
            for (int i=0;i<arr.length-2;i++){
                if (arr[i]<arr[i+1] && arr[i+1]>arr[i+2]){
                    ans=arr[i+1];
                }
            }
            return ans;
        }

        // binary search use to solve

        static int peakFind(int[] arr){
            int st=0;
            int end=arr.length-2;
            int ans=-1;
            while (st<end){
                if (arr[st]<arr[st+1] && arr[st+1]>arr[st+2]){
                    ans=arr[st+1];
                }
                st++;
            }
            return ans;
        }

        public static void main(String[] args) {
            int[] arr={2,5,9,11,4,87};
            System.out.println(peakElementFind(arr));
            System.out.println(peakFind(arr));
        }
    }
}