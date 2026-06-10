package constructorChaining;

public class B extends A{

    B(){
        System.out.println("Inside B");
    }

    B(String str){
        System.out.println(str);
    }
}
