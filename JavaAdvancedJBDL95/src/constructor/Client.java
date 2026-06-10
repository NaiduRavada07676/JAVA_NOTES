package constructor;

public class Client {

    public static void main(String[] args) {

        Student s1 = new Student();
//        System.out.println(s1);

        s1.id=1;
        s1.name="X";
        s1.gender="M";

        System.out.println(s1);

        Student s2 = new Student(2,"Sham","M");


        Student s3 = new Student(s1);
//        s3.id= s1.id;;
//        s3.name=s1.name;
//        s3.gender=s1.gender;
        //not scalable
        System.out.println(s3);



        /*
        * primitive:-
        * boolean,integer, byte, float , double
        *
        * Wrapper:-
        * Boolean, Integer, Byte, Float, Double
        *
        *
        * */
    }

}
