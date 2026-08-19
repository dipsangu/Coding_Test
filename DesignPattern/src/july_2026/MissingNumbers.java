package july_2026;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] arr = {0,1,3,4,6,7,8};

        int num=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=num){
                System.out.println(num);
                num++;
            }
            num++;
        }

    }
}
