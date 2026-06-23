package hashcodeCode;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.HashMap;

public class Client {

    public static void main(String[] args) {

        HashMap<String,Integer> mp = new HashMap<>();
        mp.put("Apple",1);
        mp.put("Mango",2);
        mp.put("Apple",3);

//        mp.get("Apple");

//        for(String x: mp.keySet()){
//            System.out.println(x);
//        }
//
//        for(String x:mp.keySet()){
//            System.out.println(mp.get(x));
//        }


        Person p1 = new Person(1,"Fred");
        Person p2 = new Person(2,"Mohan");
        Person p3 = new Person(1,"Fred");



        HashMap<Person,String> hm = new HashMap<>();
        hm.put(p1,"Manager");
        hm.put(p1,"QA");
        hm.put(p1,"HR");

        System.out.println(hm.size());

        HashMap<Person,String> hm2 = new HashMap<>();
        hm.put(new Person(1,"Fred"),"Manager");
        hm.put(new Person(2,"Mohan"),"QA");
        hm.put(new Person(1,"Fred"),"HR");

        System.out.println(hm2.size());






    }
}
