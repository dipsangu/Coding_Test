package Logic;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayOperation {
    public static void main(String[] args) {
        int [] arr = {8,2,3,5,7,8,2,3,6,4};

        //Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int a : arr){
            map.put(a, map.getOrDefault(a, 0)+1);
        }


        for(Map.Entry<Integer, Integer>mp : map.entrySet()){
            if(mp.getValue()==1){
                System.out.println(mp.getKey()+"---"+mp.getValue());
                break;
            }

        }

       // Arrays.stream(arr).filter(n->!set.add(n)).forEach(System.out::println);
      //  Arrays.stream(arr).mapToObj(a -> map.put(a, map.getOrDefault(a, 0) + 1)).forEach(System.out::println);


    }
}
