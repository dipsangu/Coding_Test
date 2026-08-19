package july_2026;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String sentence="java spring java kafka spring java";

        String [] s = sentence.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String st : s){
            map.put(st, map.getOrDefault(st,0)+1);
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue()>0){
                System.out.println(entry.getKey()+
                        "---"+entry.getValue());
            }
        }

    }
}
