package Logic;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumberInUnsortedArrayTrreSet {
    public static void main(String[] args) {
        int [] num ={4,1,6,9};

        for(int i=0; i<num.length; i++){
            int a = num[i];
            int b = num[a++];
            if(a>b){
                int temp =b;
                b=a;
                a=temp;
            }
        }



    }
}
