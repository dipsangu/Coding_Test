package Logic;

import java.util.Scanner;

public class FibonicSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number= sc.nextInt();
        int first=0;
        int second=1;
        while(number!=0){
            System.out.println(first);
            int sum= first+second;
            first=second;
            second=sum;
            number--;
        }


    }
}
