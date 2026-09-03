package LeetCode.LinesrSearch.SeptThirdTwentySix;

public class EvenDegit {
    public static void main(String[] args) {
        /*Q5 : Even Digits*/
        int [] arr = {12, 345, 21, 6, 7896};
        //out put should need to show 2
        System.out.println(CheckTheEvenCountNumber(arr));

    }

     static int CheckTheEvenCountNumber(int[] arr) {
        int count=0;
        for(int num :arr){
            if(even(num)){
                count++;
            }
        }


        return count;
    }

    private static boolean even(int num) {
       int numberDegit=digit(num);
       if(numberDegit % 2 ==0){
           return true;
       }
       return  false;

    }

    static int digit(int num){

        if(num<0){
            num= num*-1;
        }
        int count =0;
        while (num > 0){
            count++;
            num=num/10;
        }
        return count;
    }
}
