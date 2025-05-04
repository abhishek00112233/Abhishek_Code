package ArrayQuestion;

import java.util.*;

public class ArrayListClass {

    static ArrayList<Integer> reverseArrayList(ArrayList<Integer> arr) {
        int i = 0;
        int j = arr.size() - 1;
        ArrayList<Integer> num1=new ArrayList<>();

        for ( i=arr.size()-1;i>=0;i--){
            num1.add(arr.get(i));
        }
        return num1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();

        num.add(10);
        num.add(11);
        num.add(12);
        num.add(13);
        num.add(13);
        num.add(13);
//        num.add(2,14);
//        num.add(5,140);
//        num.set(1,191);
//        num.remove(1);
//        num.remove(Integer.valueOf(13));
//        System.out.println(num);
//
//        Integer d= Integer.valueOf(1);

//
//        System.out.println(num);
//        System.out.println(reverseArrayList(num));
//        System.out.println(num.reversed());
//        Collections.reverse(num);


        ArrayList<String> str=new ArrayList<>();
        str.add("apple");
        str.add("boll");
        str.add("bat");
        str.add("cup");
        str.add("mango");
        Collections.sort(str);
        System.out.println(str);
       Collections.sort(str,Collections.reverseOrder());
        System.out.println(str);
    }

    public static class BinarySearch {

        // target find
        static int findTarget(int[] arr, int target, boolean bool) {
            int left = 0;
            int right = arr.length - 1;
            int ans = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] == target) {
                    ans = mid;
                    if (bool) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                } else if (arr[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            if (ans == -1) {
                return ans;
            }
            return ans;
        }
        // flor find
        static int floorFind(int[] arr,int target){
            int st=0;
            int end=arr.length-1;
            int ans=-1;
            while (st<=end){
                int mid = st+(end-st)/2;
                if (arr[mid]==target){
                    return target;
                } else if (arr[mid]<target) {
    //                ans=arr[mid];
                    st=mid+1;
                }
                else{
                    ans=arr[mid];
                    end=mid-1;
                }
            }
            return ans;
        }

        public static void main(String[] args) {
            int[] arr={1,2,3,4,5,66,88,90};
            System.out.println(floorFind(arr,1));
        }

    }

    public static class RotatedArray {
        static void reverseArray(int[] arr ,int x,int y){
            while(x<y){
                int temp=arr[x];
                arr[x]=arr[y];
                arr[y]=temp;
                x++;y--;
            }
    //        return arr;
        }


        static int binarySearch(int[] arr,int target){
            int st=0;
            int end=arr.length-1;
            int ans=-1;
            while (st<=end){
                int mid=st+(end-st)/2;
                if (arr[mid]==target){
                    return mid;
                }
                else if(arr[st]<=arr[mid]){
                    if(arr[st]<=target && arr[mid]>=target){
                        end=mid-1;
                    }
                    else {
                        st=mid+1;
                    }
                }
                else {
                    if (arr[mid]<=target && arr[end]>=target){
                        st=mid+1;
                    }
                    else{
                        end=mid-1;
                    }
                }
            }
            return -1;
        }

        // reverse Word
        static String reverse(String str){
            String s="";
            for (int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                s=ch+s;
            }
            return s;
        }

        public static void main(String[] args) {
            int[] arr={1,2,3,4,5,6};
            int k=1;
    //        reverseArray(arr,0,arr.length-1);
    //        reverseArray(arr,0,k-1);
    //        reverseArray(arr,k,arr.length-1);
    //        System.out.println(Arrays.toString(arr));
    ////        for (int i:arr){

    //        }

            int[] arr1={4,5,6,1,2,3};
            System.out.println(binarySearch(arr1,10));
            String str="hello world how are you";
            String[] s=str.split(" ");
            for (int i=0;i<s.length;i++){
                String  s1=reverse(s[i]);
                System.out.print(s1);
//                System.out.print(s[i]);
                System.out.print(" ");
            }
        }
    }
}
