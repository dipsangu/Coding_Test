package july_2026;

import java.util.Scanner;

public class FibonicSeries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter range");
        int range=sc.nextInt();

        int i =0;
        int j=1;

        while(range!=0){
            int sum= i+j;
            System.out.println(sum);
            i=j;
            j=sum;
            range--;
        }

    }
}
