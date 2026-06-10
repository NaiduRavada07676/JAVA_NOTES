package abstraction;

public interface Animal {

    void eat();

    void sleep();

    void move();

    default void dance(){
        System.out.println("dancing");
    }

}
