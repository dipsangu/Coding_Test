package Logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr ={9,2,8,7};
        int target =9;
        List<Integer> list = new ArrayList<>();
        for(int a : arr){
            int diff=target-a;
            if(list.contains(diff)){
                System.out.println(diff+"--"+a);
            }else{
                list.add(a);
            }

        }
    }
}
