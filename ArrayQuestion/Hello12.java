package ArrayQuestion;

import java.util.Scanner;
public class Hello12 {
    static int indexFind(int[] arr,int target,boolean bool){
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
            return -1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,2,2,2,2,3,4,5,6,7,8,9};
        System.out.println(indexFind(arr,2,false));
    }
}