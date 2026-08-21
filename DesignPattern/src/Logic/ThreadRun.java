package Logic;

public class ThreadRun implements Runnable{
    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        System.out.println("Thread");

    }

    public static void main(String[] args) {
        ThreadRun th= new ThreadRun();
        Thread thr = new Thread(th);
        thr.start();
    }
}
