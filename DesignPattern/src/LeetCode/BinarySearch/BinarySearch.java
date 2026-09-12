package LeetCode.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {

        int [] arr = {2,4,5,6,7,8,9,12,14,16,18,30,40,50};
        int target=16;


        int result =searchNumber(arr, target);
        System.out.println(result);
    }

     static int searchNumber(int[] arr , int target) {

        int start=arr[0];
        int end= arr.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            } else if (arr[mid]>target) {
                end=mid-1;
            }else {
                return  mid;
            }
        }

        return -1;
    }
}
