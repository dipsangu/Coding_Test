package july_2026;

public class MissingANumber {
    public static void main(String[] args) {
        int[] arr = {0,1,3,4};

        int length= arr.length;
        int sum=length*(length+1)/2;
        int actual=0;
        for(int a : arr){
            actual=actual+a;
        }
        int missing= sum-actual;
        System.out.println(missing);
    }
}
