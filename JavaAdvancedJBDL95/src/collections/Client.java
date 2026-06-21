package collections;

import java.util.*;

public class Client {

    public static void main(String[] args) {

//        Integer []a = {1,2,3,6,8,2,9,1};
//
//        Arrays.sort(a);
//        for(int i:a){
//            System.out.println(i);
//        }
//
//        Arrays.sort(a, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2.compareTo(o1);
//            }
//        });
//
//        for(int i:a){
//            System.out.println(i);
//        }

//
//        List<Student> students = new ArrayList<>();
//        students.add(new Student(1,"Ram",84.23,Gender.MALE));
//        students.add(new Student(2,"Sham",97.30,Gender.MALE));
//        students.add(new Student(3,"Calm",94.30,Gender.MALE));
//
//        Collections.sort(students);
//        for(Student s:students){
//            System.out.println(s.name);
//        }
//
//        Collections.sort(students,new StudentScoreComparator());
//        for(Student s:students){
//            System.out.println(s.name);
//        }

//        System.out.println();

/*
* Comparable :- to define natural ordering
* Comparator :- for defining specific ordering based on any parameter
*
* Both of them are funtional interfaces
*
* */

        /*
        * Amrotised time O(1)
        * Worst Case O(n)
        *
        * array[] is fixed size
        * Arraylist is not fixed and internal default is 10 and increasing factor is 1.5
        * a[100] random access is O(1)
        * they keep insertion order
        *
        * Linked List -> Double linked list
        *
        * o(N) there is no random access
        *
        * */



//        List<String> l1 = new ArrayList<>(12);
//        l1.add("Ram");
//        l1.add("Calm");
//        l1.add("Sham");
//        l1.add("Fred");
//        for(int i=0;i<l1.size();i++){
//            System.out.println(l1.get(i));
//        }
////        l1.remove(1);
//        l1.set(1,"Noman");
//
//        for(int i=0;i<l1.size();i++){
//            System.out.println(l1.get(i));
//        }

        /*
        * immutable
        * */
//        List<String> l3 = List.of("Ram","Sham");//launched in java 9
////        l3.add("Calm");
//        for(int i=0;i<l3.size();i++){
//            System.out.println(l3.get(i));
//        }
//        l3.remove(2);



//        List<String> l4 = Arrays.asList("Ram","Sham");
//        l4.add(1,"Calm");
//        l4.set(1,"Noman");
//
//
//        for(int i=0;i<l4.size();i++){
//            System.out.println(l4.get(i));
//        }

        /*
        * Diff between array.asList() between List.of()
        *
        * in  array.asList() we can update the elements
        * but
        * List.of() its immutable
        *
        * */

        List<String> l2 = new LinkedList<>();
//        List<String> l3 = new Vector<>();
//        Stack<String> l5 = new Stack<>();
//        l5.add("Ram");
//        l5.add("Calm");
//        l5.add("Sham");
//        l5.add("Fred");

//        for(int i=0;i<l5.size();i++){
//            System.out.println(l5.get(i));
//        }
//
//        System.out.println(l5);

//        while (!l5.isEmpty()){
//            String temp = l5.pop();
//            System.out.println(temp);
//        }


//        order is not maintained it is random

//        TC -> O(1) worst case(n) (collision)
//        Set<String>s1 = new HashSet<>();
//        s1.add("Ram");
//        s1.add("Calm");
//        s1.add("Sham");
//        s1.add("Fred");
//        for (String temp : s1) {
//            System.out.println(temp);
//        }

//        natural ordering
//        TC -> log(n)

//        Set<String>s2 = new TreeSet<>();
//        s2.add("Ram");
//        s2.add("Calm");
//        s2.add("Sham");
//        s2.add("Fred");
//        for (String temp : s2) {
//            System.out.println(temp);
//        }

//        Set<String>s3 = new LinkedHashSet<>();
//        s3.add("Ram");
//        s3.add("Calm");
//        s3.add("Sham");
//        s3.add("Fred");
//        for (String temp : s3) {
//            System.out.println(temp);
//        }

//        String [] arr = "malayalam".split("a");
//        for (int i =0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//        System.out.println(arr);
        EnumSet<Gender>s4 =  EnumSet.allOf(Gender.class);
        System.out.println(s4.range(Gender.MALE,Gender.OTHERS));

//        x = Gender.MALE+ "::" +Gender.OTHERS

//        range you can use for defining range of enums but dont use it in production

//    HashMap



    }
}
