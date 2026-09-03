package LeetCode.LinesrSearch.SeptThirdTwentySix;

public class MaximumNumberInAnArray {
    public static void main(String[] args) {
        int [] arr = {21,4,6,8,23,97,32};
        System.out.println(checkTheMaximumNuber(arr));
    }

     static int checkTheMaximumNuber(int[] arr) {
        int maximum=Integer.MIN_VALUE;
        for (int num : arr){
            if(num > maximum){
                maximum=num;
            }
        }
        return maximum;
    }
}
