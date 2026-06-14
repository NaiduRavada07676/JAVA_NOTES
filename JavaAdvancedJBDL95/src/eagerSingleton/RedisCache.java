package eagerSingleton;

public class RedisCache {

    private String url;
    private String username;
    private String password;
    private int port;

    private static RedisCache instance = new RedisCache("localhost","root","root",6379);

    private RedisCache(String url, String username, String password, int port) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.port = port;
    }

    public static RedisCache getInstance(){
        return instance;
    }
}
