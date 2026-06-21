package generics;

public class Pair <V,S> {

       V first;
       S second;

       public void setFirst(V gfg){
           this.first=gfg;
       }

       public S getSecond(){
           return this.second;
       }

       public void doSomething(S s){
           System.out.println(s);
       }

        public <S> void doingSomething(S s){ //method level generic can overide class level generic
        System.out.println(s);
        }

       public <T> S doesSomething(T t){ //method level generics
           System.out.println(t);
           return (S)t;
       }

//       are generics allowed in static method
//    Yes but we can only use method level generics not class level generics because
//    static methods can be accessed without creating object and generics get
//    significance at the time of object creation
       public static <S> void doneEverything(S s){
           System.out.println(s);
       }


        public static <Z> Z doneEverything2(Z z){
        System.out.println(z);
        return z;
        }
}
