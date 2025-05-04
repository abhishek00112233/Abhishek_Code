package ArrayQuestion;

import java.util.ArrayList;
import java.util.Arrays;

public class CountSort {
    static int maxFind(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static void frequencyArray(int[] arr){
        ArrayList<Integer> num=new ArrayList<>();
        int x=maxFind(arr);
        int[] arr1=new int[x+1];
        for (int i=0;i<arr.length;i++){
            int idx=arr[i];
            arr1[idx]+=1;
        }
        for (int i=0;i<arr1.length;i++){
            if (arr1[i]>0){
                num.add(i);
            }
        }
        System.out.println(num);
    }
    //merge Sort
    static void merge(int[] arr,int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int[] left=new int[n1];
        int[] right=new int[n2];
        int i,j,k;
        for (i=0;i<n1;i++) left[i]=arr[l+i];
        for (j=0;j<n2;j++) right[j]=arr[mid+1+j];

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
        if (l>=r){
            return;
        }
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    public static void main(String[] args) {

        int[] arr = {6,32, 4, 1, 11, 5, 3, 5,23,2};
        frequencyArray(arr);
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    }

