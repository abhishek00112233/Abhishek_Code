package ArrayQuestion;

import java.util.Arrays;

public class DemoMergeSort {
    static void merge(int[] arr,int l,int mid,int r) {
       int n1=mid-l+1;
       int n2=r-mid;
       int[] left=new int[n1];
       int[] right=new int[n2];
       int i,j,k;
       for (i=0;i<n1;i++){
           left[i]=arr[l+i];
       }
       for (j=0;j<n2;j++){
           right[j]=arr[mid+1+j];
       }
       i=0;
       j=0;
       k=l;
       while (i<n1 && j<n2){
           if (left[i]<right[j]){
               arr[k++]=left[i++];
           }
           else {
               arr[k++]=right[j++];
           }
       }
       while (i<n1){
           arr[k++]=left[i++];
       }
       while (j<n2){
           arr[k++]=right[j++];
       }
    }
        static void mergeSort(int[] arr,int l,int r){
            if (l >= r) {
                return;
            }
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);

            merge(arr, l, mid, r);
        }
        static int[] sort(int[] arr1,int[] arr2){
        int n1= arr1.length;
        int n2=arr2.length;
        int[] arr=new int[n1+n2];
        n1-=1;
        n2-=1;

        int i=0,j=0,k=0;
        while (i<=n1 && j<=n2){
            if (arr1[i]<arr2[j]){
                arr[k++]=arr1[i++];
            }
            else {
                arr[k++]=arr2[j++];
            }
        }
        while (i<=n1){
            arr[k++]=arr1[i++];
        }
        while (j<=n2){
            arr[k++]=arr2[j++];
        }
        return arr;
        }
    public static void main(String[] args) {
        int[] arr1 = {0, -2, 8, 11,-17};
        int[] arr2 = {21, 45,67, 68,};
        mergeSort(arr1,0,arr1.length-1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(sort(arr1,arr2)));


        int n1=arr1.length;
        int n2=arr2.length;
        int[] arr=new int[n1+n2];
        n1-=1;
        n2-=1;

        int i=0,j=0,k=0;

        while (i<=n1 && j<=n2){
            if (arr1[i]<arr2[j]){
                arr[k++]=arr1[i++];
            }
            else {
                arr[k++]=arr2[j++];
            }
        }
        while (i<=n1){
            arr[k++]=arr1[i++];
        }
        while (j<=n2){
            arr[k++]=arr2[j++];
        }
        System.out.println(Arrays.toString(arr));
    }
}
