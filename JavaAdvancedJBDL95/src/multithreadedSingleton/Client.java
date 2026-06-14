package multithreadedSingleton;

public class Client {

    public static void main(String[] args) {
        RedisCache redisCache = RedisCache.getInstance();
        System.out.println(redisCache);
        Temp temp = new Temp();
        temp.print();
    }
}
