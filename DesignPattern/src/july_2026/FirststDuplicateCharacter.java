package july_2026;

import java.util.HashMap;
import java.util.Map;

public class FirststDuplicateCharacter {
    public static void main(String[] args) {
        String s = "sangrammallik";
        char[] ch = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : ch) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {

                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
