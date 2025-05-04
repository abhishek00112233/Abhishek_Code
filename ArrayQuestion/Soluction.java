package ArrayQuestion;
    class Solution {
        public static int integerReplacement(int n) {
            int count=0;
            while(n>=1){
                if(n%2==0){
                    n-=1;
                    n/=2;
                    count++;
                }
                else{
                    n+=1;
                    n=n/2;
                    count++;
                }
            }
            return count;
        }

        public static void main(String[] args) {
            int n=8;
            System.out.println(integerReplacement(7));
        }
    }
