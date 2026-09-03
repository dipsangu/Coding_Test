package Logic;

import java.util.HashMap;
import java.util.Map;

public class FIndMaxCountOccurance {
    public static void main(String[] args) {
        int [] arr = {1,1,1,2,2,2,3,3};

        Map<Integer, Integer> map = new HashMap<>();
        for (int value : arr){
            map.put(value, map.getOrDefault(value,0)+1);
        }

        int maxValues=0;
        int maxKey=0;
        for(Map.Entry<Integer, Integer> map1 : map.entrySet()){
            if(maxValues<map1.getValue()){
                maxValues=map1.getValue();
                //maxKey=map1.getKey();
            }


        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()==maxValues){
                System.out.println(entry.getKey()+"--"+entry.getValue());
            }
        }
       // System.out.println(maxKey+"--"+maxValues);

    }
}
