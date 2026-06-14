package producerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {

        ExecutorService ex = Executors.newCachedThreadPool();
        Store store = new Store(5);
        Semaphore ps = new Semaphore(5);
        Semaphore cs = new Semaphore(0);

        for (int i = 0; i < 5; i++) {
            ex.submit(new Producer(store,ps,cs));
        }
        for (int i = 0; i < 10; i++) {
            ex.submit(new Consumer(store,ps,cs));
        }


    }
}
