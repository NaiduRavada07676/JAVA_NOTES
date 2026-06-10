package abstraction;

public abstract class User {

    int id;
    String name;

    abstract void writing();

    void teach(){
        System.out.println("teaching");
    }
}
