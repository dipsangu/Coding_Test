package Logic;

import java.util.HashMap;
import java.util.Map;

public class FinFrequencyMax {
    public static void main(String[] args) {
        int arr [] ={1,1,1,2,2,2,3,3};
        Map<Integer, Integer> map = new HashMap<>();
        for(int a : arr){
            map.put(a, map.getOrDefault(a, 0)+1);
        }
        int maxfrequency=0;
        for(int fr : map.values()){
            if(maxfrequency>fr){

            }else{
                maxfrequency=fr;
            }
        }
        for(Map.Entry<Integer, Integer> ma : map.entrySet()){
            if(ma.getValue()==maxfrequency){
                System.out.print(ma.getKey()+"----"+maxfrequency);
            }
        }



    }

}
