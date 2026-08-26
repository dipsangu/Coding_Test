package DSCode;

public class SubArrayList {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};

        int size = arr.length;
        int a=0;
        int b=0;

        while (a<size){
            if(b>=a && b <size){
                System.out.println(b);
                b++;
            }
        }

    }
}
