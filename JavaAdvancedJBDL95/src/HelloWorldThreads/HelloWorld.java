package HelloWorldThreads;

public class HelloWorld implements Runnable{
    @Override
    public void run() {
        System.out.println("inside Hello "+ Thread.currentThread().getName());
    }
}
