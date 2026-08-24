package Logic;

public class SearchNumber {
    public static void main(String[] args) {
        int [] arr = {1,3,5,2,9,6,3,5,3};
        int num=3, count=0;
        for (int i=0; i<arr.length; i++){
            if(arr[i]==num){
                count++;
                //System.out.println(num);
            }
        }
        System.out.println(num+"--"+count);
    }
}
