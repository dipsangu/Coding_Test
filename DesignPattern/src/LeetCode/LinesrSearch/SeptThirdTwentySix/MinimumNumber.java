package LeetCode.LinesrSearch.SeptThirdTwentySix;

public class MinimumNumber {
    public static void main(String[] args) {
       /* Q3 : Minimum Number*/

        int [] arr = {44,52,652,76,12,67,90,342};

        System.out.println(checkTheMenimumElement(arr));
    }

     static int checkTheMenimumElement(int[] arr) {
        int menimum=Integer.MAX_VALUE;
        for(int element : arr){
            if(element <menimum){
                menimum=element;
            }
        }
        return menimum;
    }
}
