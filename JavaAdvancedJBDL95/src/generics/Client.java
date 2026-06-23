package generics;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        Pair p = new Pair();  //raw data types
        p.setFirst(10000);
        p.setFirst("India");
        System.out.println(p.first);
        p.second="RAM";
        p.getSecond();

//        it is skipping compile time check

//        why is it allowed?
//        Backward compatability
//        Legacy codes
//        after java 5 generics were introduced
//        if i don't allow them it will break OC principle mainly ity will break the older version codes


        Pair<String,Long> pair = new Pair<String,Long>();
        Pair<String,Long> pair2 = new Pair</*optional*/>();
        pair.first="India";
        pair.second=100000L;
        System.out.println(pair.getSecond());

        pair.doSomething(1000L);

        pair.doesSomething(1000);
        System.out.println(pair.doesSomething("MAN"));

        pair.<Integer>doingSomething(100); // IN METHOD LEVEL GENERICS PROVIDING DATA TYPE IS OPTIONAL

        Pair.<String>doneEverything("mango");
        Pair.doneEverything2(100L);
        System.out.println(pair.getClass().getName());



//        Inheritance based on Generics

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Dog());
        animals.add(new Cat());

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());

        Util.doSomething2(dogs);

        Util.doSomething3(dogs);

    }
}
