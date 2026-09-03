package Logic;

public class ZeroMo {
    public static void main(String[] args) {
        int [] arr ={1,0,2,0,3,0,7,4,0,8};
        int z=0;
        int nz=0;

        int size=arr.length;

        if(size==0 || size==1){
            return;
        }
        while (nz<size){
            if(arr[nz]==0){
                nz++;
            }else{
                int temp= arr[nz];
                arr[nz]=arr[z];
                arr[z]=temp;
                nz++;
                z++;
            }
        }
        for (int val : arr){
            System.out.println(val);
        }
    }
}
