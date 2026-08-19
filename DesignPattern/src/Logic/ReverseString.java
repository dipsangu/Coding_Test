package Logic;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();

        //Java 8
        String reverse = s.chars()
                .mapToObj(c -> String.valueOf((char) c))   // cast int -> char BEFORE valueOf
                .reduce("", (partial, ch) -> ch + partial);
        System.out.println(reverse.toString());

        char [] ch = s.toCharArray();
        String s2="";
        for(int i=ch.length-1; i>=0; i--){
            s2=s2+ch[i];
        }
        System.out.println(s2);
    }
}
