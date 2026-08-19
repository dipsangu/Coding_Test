package july_2026;

public class PrimeInAnArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        for(int a :arr){
            primeCheck(a);
        }
    }

    private static void primeCheck(int a) {
        int count=0;
        for (int i=1; i<=a; i++){
            if(a%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(a);
        }
    }
}
