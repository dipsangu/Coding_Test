package july_2026;

import java.util.Arrays;
import java.util.Scanner;

public class CheckStringAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1st String");
        String s1=sc.nextLine();
        System.out.println("2nd String is");
        String s2=sc.nextLine();

        chechAngram(s1, s2);
    }

    private static void chechAngram(String s1, String s2) {

        String st1=s1.replace("//s"," ").toLowerCase();
        String st2=s2.replace("//s"," ").toLowerCase();

        if(st1.length()!=st2.length()){
            System.out.println("Not a anagram");

        }

        char [] ch1=st1.toCharArray();
        char [] ch2=st2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
      if(Arrays.equals(ch1,ch2))  {
          System.out.println("Anagram");
      }else {
          System.out.println("not");
        }

    }
}
