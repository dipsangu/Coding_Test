package Logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {9, 2, 8, 7};
        int target = 9;

        Map<Integer, Integer> map = new HashMap<>(); // value -> index
        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if (map.containsKey(diff)) {
                System.out.println(map.get(diff) + "--" + i);
            } else {
                map.put(arr[i], i);
            }
        }
    }
}
