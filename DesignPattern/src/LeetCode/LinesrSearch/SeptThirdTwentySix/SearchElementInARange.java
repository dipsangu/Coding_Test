package LeetCode.LinesrSearch.SeptThirdTwentySix;

public class SearchElementInARange {
    public static void main(String[] args) {
        /*Q2 : Search in Range*/

        int [] arr ={2,3,5,7,8,32,45,13,76,42,1};
        int start=2;
        int end=7;
        int target=7;
        System.out.println(checkTheNmber(arr, start,end,target));
    }

    static boolean checkTheNmber(int[] arr, int start, int end, int target) {
        for( int i=start; i<end ; i++){
            if(arr[i]==target){
                return true;
            }
        }

        return false;
    }
}
