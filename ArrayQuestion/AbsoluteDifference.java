package ArrayQuestion;

import java.util.Arrays;

public class AbsoluteDifference {
    static int[] absolute(int[] arr,int k){
        for (int i=0;i<arr.length;i++){
            arr[i]-=k;
        if (arr[i]<0){
            arr[i]*=-1;
        }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={10,5,3,9,2};
        int k=7;
        System.out.println(Arrays.toString(absolute(arr,k)));
    }
}
