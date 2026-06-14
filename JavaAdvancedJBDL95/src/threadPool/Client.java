package threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();


        ExecutorService ex2 = Executors.newFixedThreadPool(10);

        for(int i=1;i<=10000000;i++){
//            Thread thread1 = new Thread(new PrintNumber(i),""+i);
            if(i==800){
                System.out.println(i);
            }
            ex2.submit(new PrintNumber(i));
        }

    }
}
