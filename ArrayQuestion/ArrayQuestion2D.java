package ArrayQuestion;

public class ArrayQuestion2D {
    static void spiralMatrix(int[][] arr){
        int st=0;
        int top=0;
        int right=arr.length-1 ;
        int left=0;
        int bottom= arr[0].length-1;

        while (st<right*right){

            for (int i=top;i<=right ;i++){
                System.out.print(arr[top][i]+" ");
            }
            top++;

            for (int i=top;i<=right && st<(right*right);i++){
                System.out.print(arr[i][right]+" ");
            }
            right--;

            for (int i=bottom;i>=0 && st<(right*right);i--){
                System.out.print(arr[bottom][i]+" ");
            }
            bottom--;
            for (int i=bottom;i>=top && st<(right*right);i--){
                System.out.print(arr[i][left]+" ");
            }
            left++;
            st++;
        }
//        return -1;
    }

    public static void main(String[] args) {
        int [][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        spiralMatrix(arr);
    }
    }
