package Logic;

import java.util.LinkedList;
import java.util.Queue;

public class ProdCom {
    int capacity;

    public ProdCom(int capacity) {
        this.capacity = capacity;
    }

    Queue<Integer> queue = new LinkedList<>();

    public synchronized  void producer(int value) throws InterruptedException {
        if(capacity==value){
            wait();
        }else {
            queue.add(value);
            System.out.println("Producer produce  "+value);
            notifyAll();
        }

    }
    public synchronized void consumer() throws InterruptedException {
        if(queue.isEmpty()){
            wait();
        }else {
            int result=queue.poll();
            System.out.println("Consumer consume  "+result);
            notifyAll();
        }
    }

    public static void main(String[] args) {
        ProdCom prodCom = new ProdCom(5);

        Thread th1 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    prodCom.producer(i);
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
                );
        Thread th2 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    prodCom.consumer();
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        th1.start();
        th2.start();
    }

}
