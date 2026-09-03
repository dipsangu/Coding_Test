package LeetCode.LinesrSearch.SeptThirdTwentySix;

import java.util.Arrays;

public class SearchNumberInTwoDArray {
    public static void main(String[] args) {
        /*Search in 2D Arrays*/

        int [][] arr = {
                {1,2,3},
                {4,5,6,7},
                {8,9,10,11,12,13},
                {20,25,32}
        };
        int target = 40;
       // System.out.println(SearchElementTwoDArray(arr, target));
       int [] index=  SearchElementTwoDArray(arr, target);
        System.out.println(Arrays.toString(index));
    }

     static int [] SearchElementTwoDArray(int[][] arr, int target) {
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(target==arr[row][col]){
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1,-1};
    }
}
