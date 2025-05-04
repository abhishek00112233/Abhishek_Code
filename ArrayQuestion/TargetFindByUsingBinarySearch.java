package ArrayQuestion;

public class TargetFindByUsingBinarySearch {
    static boolean targetFind(int[] arr,int target){
        int st=0;
        int end=arr.length-1;
        while (st<=end){
//            int mid=st+(end-st)/2;
            if (arr[st]+arr[end]==target){
                return true;
            } else if (arr[st]+arr[end]<target) {
                st=st+1;
            }
            else {
                end=end-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,2,5,7,9,12,24};
        System.out.println(targetFind(arr,37));
    }
}
