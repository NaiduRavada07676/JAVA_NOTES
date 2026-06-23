package generics;

import java.util.List;

public class Util {

    public static void doSomething(List<Animal> animals){

        animals.add(new Animal());
        animals.add(new Dog());
        animals.add(new Cat());

        for(Animal animal:animals){
            System.out.println(animal.getClass().getName());
        }
    }

    public static void doSomething2(List<? extends Animal> animals){

//        animals.add(new Animal());
//        animals.add(new Dog());
//        animals.add(new Cat());

        for(Animal animal:animals){
            System.out.println(animal.getClass().getName());
        }
    }

    public static <T extends Animal> void doSomething3(List<T> animals){

//        animals.add(new Animal());
//        animals.add(new Dog());
//        animals.add(new Cat());

        for(Animal animal:animals){
            System.out.println(animal.getClass().getName());
        }
    }
}
