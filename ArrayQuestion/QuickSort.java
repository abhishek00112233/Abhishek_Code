package ArrayQuestion;

import com.sun.source.tree.BreakTree;

import java.util.Arrays;
import java.util.SortedMap;

public class QuickSort {
    static int partition(int[] arr,int l,int h){
        int pivot=arr[h];
        int i=l-1;

        for (int j=l;j<h;j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[h]=temp;
        return i;
    }
    static void quickSort(int[] arr,int l,int h){
        if (l<h){
            int Pidx=partition(arr,l,h);
            quickSort(arr,l,Pidx-1);
            quickSort(arr,Pidx+1,h);
        }
    }

    public static void main(String[] args) {
        int[] arr={6,1,34,9,-12};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
