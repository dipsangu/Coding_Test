package july_2026;

import java.util.HashSet;
import java.util.Set;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] a={1,3,4,5,7,8,9};
        int expected=a[0];

        for(int c :a){
                while (expected<c){
                    System.out.println(expected);
                    expected++;
                }
                expected++;
        }
        Set<Integer> set = new HashSet<>();
        for (int b :a){
            while (!set.add(b)){
                System.out.println(set);
            }


        }


    }
}
