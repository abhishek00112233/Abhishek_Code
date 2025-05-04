package ArrayQuestion;

import java.util.Arrays;

public class MergeTwoSortedArray {
    static void mergeSortedArray(int[] arr1,int[] arr2){
        int[] res=new int[arr1.length+ arr2.length];
        int i=0,j=0,k=0;
        int n1=arr1.length;
        int n2=arr2.length;
        while (i<n1 && j<n2){
            if (arr1[i]<arr2[j]){
                res[k++]=arr1[i++];
            }
            else {
                res[k++]=arr2[j++];
            }
        }
        while (i<n1){
            res[k++]=arr1[i++];
        }
        while (j<n2){
            res[k++]=arr2[j++];
        }
        System.out.println(Arrays.toString(res));
    }

    public static void main(String[] args) {
        int[] arr={1,3,5,8};
        int[] arr3={2,4,6,7};
        mergeSortedArray(arr,arr3);
    }
}
