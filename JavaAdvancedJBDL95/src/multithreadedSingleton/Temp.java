package multithreadedSingleton;

public class Temp {

    public void print(){
        RedisCache redisCache = RedisCache.getInstance();
        System.out.println(redisCache);
    }
}
