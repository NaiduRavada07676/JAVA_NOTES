package producerConsumer;

import java.util.concurrent.Callable;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    Store store;
    Semaphore ps;
    Semaphore cs;

    public Consumer(Store store, Semaphore ps, Semaphore cs) {
        this.store = store;
        this.ps = ps;
        this.cs = cs;
    }

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run()  {

        while (true){
//            synchronized (store){
            try {
                cs.acquire();
                if(store.items.size()>0){
                    store.consume();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            ps.release();

//            }

        }

    }
}
