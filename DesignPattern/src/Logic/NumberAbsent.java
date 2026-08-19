package Logic;

public class NumberAbsent {
    public static void main(String[] args) {
        int [] ar ={1,8,3,4,5};

        //sortarray(ar);

        int num=ar[0];
        for(int i=0; i<ar.length; i++){
            if(num!=ar[i]){
                System.out.println(num);
                num++;
            }
            num++;
        }


    }

}
