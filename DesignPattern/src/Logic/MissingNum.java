package Logic;

public class MissingNum {
    public static void main(String[] args) {

        int []  arr= {1,3,4,6,8,9};
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
