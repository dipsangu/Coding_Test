package Logic;

import java.util.Arrays;

public class SortingAArray {
    public static void main(String[] args) {
        int [] arr ={4,7,2,1,9,6,3,5};
        checkSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    public   static void checkSorting(int [] a){

        int i=0;

        while (i<a.length){

            if(i==0 || a[i]> a[i-1]){
                i++;
            }else {
                int temp =a[i];
                a[i]=a[i-1];
                a[i-1]=temp;
                i--;
            }

        }

    }
}
