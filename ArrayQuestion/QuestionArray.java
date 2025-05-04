package ArrayQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionArray {
    //sort Array Question
    static int[] sortStartNegativeNumber(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-1;j++){
                if (arr[j]>0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

    int[] arr={19,-20,7,-4,-13,11,-5,3};
    sortStartNegativeNumber(arr);
        System.out.println(Arrays.toString(arr));

        int n=sc.nextInt();
        int k=0;
        int[] arr2=new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Enter value of Array index "+i);
            arr2[i]+=sc.nextInt();
        }

        for (int i=0;i<arr2.length;i++){
            for (int j=0;j<arr2.length-1;j++){
                if (arr2[j]>arr2[j+1]){
                    int temp=arr2[j];
                    arr2[j]=arr2[j+1];
                    arr2[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr2));
    }

}
