package Logic;

import java.util.HashSet;

public class MissingNumbersInAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 8, 3, 4, 5};

        int min=arr[0];
        int max=arr[0];
        HashSet<Integer> hashSet = new HashSet<>();

        for(int num : arr){
            hashSet.add(num);
            if(num<min){
                min=num;
            }
            if(num>max){
                max=num;
            }

        }
        for(int i=min; i<max; i++){
         if(!hashSet.contains(i))   {
             System.out.println(i);
            }
        }
    }
}
