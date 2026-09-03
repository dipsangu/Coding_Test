package LeetCode.LinesrSearch.SeptThirdTwentySix;

public class SearchANumber {
    public static void main(String[] args) {


      /*30:30
        33:35 Q3 : Minimum Number
        37:26 Q4 : Search in 2D Arrays
        49:15 Q5 : Even Digits
        1:00:27 Optimized Solution for Q5
        1:04:05 Q6 : Max Wealth
        1:14:47 Outro*/
        int [] arr = {18,12,9,14,77,50};
        int target=9;
        System.out.println(SearchElement(arr, target));
    }

     static int SearchElement(int[] arr, int target) {
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }


        return -1;
    }

}
