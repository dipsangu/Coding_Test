package july_2026;

public class reverseANumber {
    public static void main(String[] args) {
        int number=123;

        int rev=0;
        while(number!=0){
            int remider= number%10;
            rev=rev*10+remider;
            number=number/10;
        }
        System.out.println(rev);
    }
}
