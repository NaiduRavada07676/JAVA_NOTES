package constructor;

public class Student {

    int id;
    String name;

    Student(){

    }
    Student(int id){

    }

    Student(int id, String name){
        this.id=1;
        this.name="ram";
    }

    public Student(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    Student(Student s){
        this.id=s.id;
        this.name=s.name;
        this.gender=s.gender;
    }

    //    signature should be different
//    signature + name and parameters



//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", gender='" + gender + '\'' +
//                '}';
//    }

    String gender;
}
