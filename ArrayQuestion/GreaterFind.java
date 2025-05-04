package ArrayQuestion;

import java.util.ArrayList;

public class GreaterFind {
    boolean checkSorted(int[] arr,int x,int y){
        int x1=x;
        int y1 =y;
        for (int i = x1; i< y1; i++){
            if (arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
     void greaterFind(int[] arr){
        ArrayList<Integer> num=new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            if (checkSorted(arr,i,arr.length-1)==true){
                System.out.println(arr[i]);
                num.add(arr[i]);
            }
        }
         System.out.println(num);
    }
    public static void main(String[] args) {
//        GreaterFind g=new GreaterFind();
//        int[] arr={2,3,5,7,9,6,2};
//        g.greaterFind(arr);

        int[][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[i].length;j++){
//                if (i==0&&j==0 ||i==0&&j==1 || i==arr.length-1&&j==arr.length-1  ){
//                    System.out.print(arr[i][j]);
//                }
//            }
//                System.out.println();
//        }
    }
}
