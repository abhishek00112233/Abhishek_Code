package ArrayQuestion;

import java.util.Arrays;

public class MergeSortImplement {
    void merge(int[] arr,int st,int mid,int end){
        int n1=mid-st+1;
        int n2=end-mid;
        int[] left=new int[n1];
        int[] right=new int[n2];

        int i,j,k;
        // fill left array
        for (i=0;i<n1;i++) left[i]=arr[st+i];
        //fill right array
        for (j=0;j<n2;j++) right[j]=arr[mid+1+j];

        i=0;k=st;j=0;
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
     void mergeSort(int[] arr,int st,int end){
        if (st>=end) return;
        int mid=(st+end)/2;
        mergeSort(arr,0,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,st,mid,end);
    }

    public static void main(String[] args) {
        MergeSortImplement ms=new MergeSortImplement();
        int[] arr={7,4,2,6,4,5,1,5,3,1,6,7,1};
        ms.mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}