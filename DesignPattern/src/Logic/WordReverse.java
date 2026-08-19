package Logic;

import java.util.Scanner;

public class WordReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an sentence");
        String word = sc.nextLine();
        char [] ch = word.toCharArray();
        String s2="";
        String s3="";

        for(int i=0; i<ch.length; i++){

            if(ch[i]!=' '){
            s2=s2+ch[i];
            }else{
                s3=s2+" "+s3;
                s2="";
            }
        }
        System.out.println(s2+" "+s3);



    }
}
