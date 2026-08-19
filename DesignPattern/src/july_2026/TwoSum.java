package july_2026;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={2,9,6,7,11,15};

        int target=9;
        int n1=arr[0];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a = 0; a < arr.length; a++) {

            int diff = target - arr[a];

            if(map.containsKey(diff)){
                System.out.println(map.get(diff)+"--"+a);
                System.out.println(arr[map.get(diff)]);
                System.out.println(arr[a]);
            }else{
                map.put(arr[a],a);
            }

        }


    }
}
