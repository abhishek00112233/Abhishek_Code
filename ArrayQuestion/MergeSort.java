package ArrayQuestion;

import java.util.Arrays;

public class MergeSort {
    static void merge(int[] arr,int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int[] left=new int[n1];
        int[] right=new int[n2];
        int i,j,k;
        for ( i=0;i<n1;i++)left[i]=arr[l+i];

        for (j=0;j<n2;j++)right[j]=arr[mid+1+j];

        i=0;j=0;k=l;

        while (i<n1 && j<n2){
            if (left[i]<right[j]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while (j<n2){
            arr[k++]=right[j++];
        }

    }
    static void mergeArray(int[] arr,int l,int r){
        if (l>=r)
            return;
        int mid=(l+r)/2;
        mergeArray(arr,l,mid);
        mergeArray(arr,mid+1,r);
        merge(arr,l,mid,r);
    }

    // Merger Sort
    static void merge1(int[] arr,int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int[] left=new int[n1];
        int[] right=new int[n2];

        int i,j,k;
        //Fill left side Array
        for (i=0;i<n1;i++) left[i]=arr[l+i];
        //Fill right side Array
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
    static void mergeSort1(int[] arr,int l,int r){
        if (l>=r){
            return;
        }
        int mid=(l+r)/2;
        mergeSort1(arr,0,mid);
        mergeSort1(arr,mid+1,r);
        merge1(arr,l,mid,r);
    }

    public static void main(String[] args) {
        int[] arr={7,5,0,2,5,1};
        mergeArray(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        System.out.println(" second way ");
        mergeSort1(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
