package ArrayQuestion;

import java.util.Arrays;

public class Rotate90Degree {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int i=0;i<arr.length;i++){
            for (int j=arr[i].length-1;j>=0;j--){
//                System.out.print(arr[j][i]);
                int temp=arr[j][i];
                arr[j][i]=arr[i][j];
                arr[i][j]=temp;
            }
//            System.out.println();
        }
        for (int i[]:arr){
            for (int j:i){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
