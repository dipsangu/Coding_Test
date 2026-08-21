package Logic;

public class MyThread extends Thread{

    public void run(){
        for (int i=1; i<=5; i++){
            try {
               Thread.sleep(900);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1= new MyThread();
        MyThread t2 = new MyThread();
        t1.start();

        t2.start();
        //t1.wait();
        t1.yield();



    }
}
