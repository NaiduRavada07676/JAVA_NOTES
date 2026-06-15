package polymorphism;

public class Animal {

    void eat(){
        System.out.println("eating");
    }

    void eat(String str){
        System.out.println("eating "+ str);
    }

    int eat(String str, int x){
        return x;
    }
}
