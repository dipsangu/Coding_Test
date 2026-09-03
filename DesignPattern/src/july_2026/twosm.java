package july_2026;

import java.util.ArrayList;
import java.util.List;

public class twosm {
    public static void main(String[] args) {
        int [] arr ={9,2,8,7};
        int target =9;
        List<Integer> lis = new ArrayList<>();

        for (int a : arr){
            int value=target-a;
            if(lis.contains(value)){
                System.out.println(value+"--"+a);
            }else {


                lis.add(value);
            }
        }
    }
}
