package Logic;

public class Miss {
    public static void main(String[] args) {
        int [] arr = {1,3,4,6,8};

        int num=arr[0];
        for (int a = 0; a < arr.length; a++) {

            if(num!=arr[a]){
                System.out.println(num);
                num++;
            }
            num++;
        }
    }
}
