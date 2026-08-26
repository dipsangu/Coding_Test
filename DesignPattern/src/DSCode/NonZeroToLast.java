package DSCode;

public class NonZeroToLast {
    public static void main(String[] args) {

        int [] arr = {0,2,0,3,0,0,8,9,0};
        int z= 0, nz=0;
        int size = arr.length;

        if(size == 0  || size == 1){
            return;
        }
        while (nz<size){

            if(arr[nz]!= 0){
                nz++;
            }else{
                int temp = arr[nz];
                arr[nz] = arr [z];
                arr[z] = temp;
                nz++;
                z++;
            }
        }

        for (int value : arr) {
            System.out.println(value);
        }
    }
}
