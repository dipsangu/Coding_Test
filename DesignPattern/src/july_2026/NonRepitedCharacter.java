package july_2026;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NonRepitedCharacter {
    public static void main(String[] args) {
        String str = "aabbcdeeff";
        char [] ch =str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for(char c : ch){
            map.put(c, map.getOrDefault(c,0)+1);
        }
       /* for(char c :ch){
          if  (map.get(c)==1){
              System.out.println(c);
          }
        }*/
        /*for (Map.Entry<Character, Integer> m : map.entrySet()) {
            if(m.getValue()>0){
                System.out.println(m.getKey()+"--"+m.getValue());
            }

        }*/
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            if(m.getValue()==1){
                System.out.println(m.getKey());
                break;
            }
        }
    }
}
