package syncAdderSub;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Integer> {

    Count count;

    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public Integer call() throws Exception {

        for(int i=0;i<1000;i++){
            count.incrementByX(i);
//            synchronized (count){
//                count.value+=i;
//            }
        }

        return count.value;
    }
}
/*
* Critical Section
* Race Condition(can be removed)
* Preemption
*
*
* Solutions
* 1. Mutex(Lock)
* */