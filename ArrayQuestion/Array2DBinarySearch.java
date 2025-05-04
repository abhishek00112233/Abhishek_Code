package ArrayQuestion;

public class Array2DBinarySearch {
    static int binarySearch1(int[] arr,int target){
        int st=0;
        int end=arr.length-1;
        int ans=-1;
        int k=0;
        while (st<=end){
            int mid=st+(end-st)/2;
            if (arr[mid]==target){
                ans=mid;
//                    k++;
                if (false){
                    end=mid-1;
                }
                else {
                    st=mid+1;
                }
            } else if (arr[mid]<target) {
                st=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        if (ans==-1){
            return -1;
        }
        return ans;
    }

}
