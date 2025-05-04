package ArrayQuestion;

public class SecondLargestFind {
    public static int secondMax(int[] arr){
        int max=arr[0];
        int max2=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max ){
                max=arr[i];
            } else if (arr[i]<max) {
                max2=arr[i];

            }
        }
        System.out.println(max);
        return max2;
    }
    public static void main(String[] args) {
        int[] arr={2,32,12,43,65,67};
        System.out.println(secondMax(arr));
    }
}
