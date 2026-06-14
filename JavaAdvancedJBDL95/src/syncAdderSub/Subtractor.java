package syncAdderSub;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Integer> {

    Count count;


    public Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public Integer call() throws Exception {

        for (int i = 0; i <1000; i++) {
            count.decrementByX(i);
//            synchronized (count){
//                count.value-=i;
//            }
        }
        return count.value;
    }
}
