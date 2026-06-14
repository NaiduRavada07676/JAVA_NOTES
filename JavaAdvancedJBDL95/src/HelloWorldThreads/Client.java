package HelloWorldThreads;

public class Client {


    public static void doSomething(){
        System.out.println("inside doSomething "+ Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        doSomething();
        HelloWorld helloWorld = new HelloWorld();
        Thread thread = new Thread(helloWorld,"Hello");
        thread.start();



        for(int i=1;i<=100;i++){
            Thread thread1 = new Thread(new PrintNumber(i),""+i);
            thread1.start();
        }


    }
}
