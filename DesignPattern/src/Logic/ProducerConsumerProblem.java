package Logic;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerProblem {
    int capacity;

    public ProducerConsumerProblem(int capacity) {
        this.capacity = capacity;
    }

    Queue<Integer> queue = new LinkedList<>();

    public synchronized void  producer(int value) throws InterruptedException {
        while (queue.size()==capacity){
            wait();
        }
        queue.add(value);
        System.out.println("Produced  "  +value);
        notifyAll();

    }
    public  synchronized  void consumer() throws InterruptedException {
        while (queue.isEmpty()){
            wait();
        }
        int result=queue.poll();
        System.out.println("Consumend  "+result);
        notifyAll();
    }

    public static void main(String[] args) {
        ProducerConsumerProblem prod = new ProducerConsumerProblem(5);
        Thread praduce = new Thread(()->
        {
            for (int i = 0; i < 10; i++) {
                try {
                    prod.producer(i);
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
                );
        Thread consum = new Thread(()->
        {
            for (int i = 0; i < 10; i++) {
                try {
                    prod.consumer();
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
                );
        praduce.start();
        consum.start();
    }
}
