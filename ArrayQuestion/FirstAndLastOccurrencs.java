package ArrayQuestion;

import java.util.Arrays;

 class FirstAndLastOccurrencs {
    int searchArrayPosition(int[] arr,int target,boolean bool){
        int st=0;
        int end=arr.length-1;
        int ans=-1;
        while (st<=end){
            int mid=st+(end-st)/2;
            if (arr[mid]== target){
                ans=mid;
                if (bool){
                    end=mid-1;
                }
                else {
                    st=mid+1;
                }
            } else if (arr[mid] < target) {
                st=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        if (ans==-1){
            return ans;
        }
        return ans;

    }

     public static void main(String[] args) {
        FirstAndLastOccurrencs obj=new FirstAndLastOccurrencs();
         int[] arr={1,2,3,4,4,4,4,4,6,7,8,9,9,9,9,9};
         int target=9;
         int[] arr2=new int[2];
         arr2[0]=obj.searchArrayPosition(arr,target,true);
         arr2[1]=obj.searchArrayPosition(arr,target,false);
         System.out.println(Arrays.toString(arr2));
}
 }