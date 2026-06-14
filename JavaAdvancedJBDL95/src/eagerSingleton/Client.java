package eagerSingleton;

public class Client {

    public static void main(String[] args) {
        RedisCache redisCache = RedisCache.getInstance();
    }
}
