package LeetCode.LinesrSearch.SeptThirdTwentySix;

public class MaxWealth {
    public static void main(String[] args) {
        /*Q6 : Max Wealth*/

        int [][] arr = {
                {1,5},
                {7,3},
                {3,5}
        };
        System.out.println(checkMaxWealth(arr));
    }

     static int checkMaxWealth(int[][] arr) {
         int max=Integer.MIN_VALUE;
        for (int row =0 ; row<arr.length; row++){
            int sum=0;
            for (int col=0; col<arr[row].length; col++){
                sum+=arr[row][col];
                if(sum>max){
                    max=sum;
                }
            }
        }
        return max;
    }




}
