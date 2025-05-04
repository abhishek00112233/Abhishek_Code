package ArrayQuestion;

import java.util.Arrays;

public class ArrayQuestionSolution {
   // find first occurrences in given array
    static int binarySearch(int[] arr,int target,boolean bool){
        int st=0;
        int end=arr.length-1;
        int ans=-1;
        while (st<=end){
            int mid=st+(end-st)/2;
            if (arr[mid]==target){
                ans=mid;
                if (bool){
                    end=mid-1;
                }
                else {
                    st=mid+1;
                }
            } else if (arr[mid]<target) {
                st=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        if (ans==-1){
            return ans;
        }
        return ans;
    }

    // Absolute different element
    static int[] absoluteFind(int[] arr,int target){
        for (int i=0;i< arr.length;i++){
            arr[i]=arr[i]-target;
            if (arr[i]<0){
                arr[i]*=-1;
            }
        }
        return arr;
    }
    // find element
    static int elementFind(int[] arr,int target){
//        int st=0;
//        int end=arr.length-1;
        arr=absoluteFind(arr,target);

        System.out.println(Arrays.toString(arr));
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr={1,5,7,9,11,13,15};
        int target=10;
        int x=elementFind(arr,target);
        System.out.println(x);


//        System.out.println(Arrays.toString(applicentFind(arr,target)));
//        int first=binarySearch(arr,target,true);
//        int last=binarySearch(arr,target,false);
//        System.out.println(first);
//        System.out.println("number of occur : "+(last-first+1));

    }
}
