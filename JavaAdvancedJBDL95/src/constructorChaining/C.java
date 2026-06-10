package constructorChaining;

public class C extends B{
//    C(){
//        System.out.println("Inside C");
//    }
    C(String str){
        super("hi");
        System.out.println("C having " + str);
    }
    C(Integer x, String b){
        System.out.println(x+b);
    }
}
