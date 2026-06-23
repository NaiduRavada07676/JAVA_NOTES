package immutable;

public class Client {

    public static void main(String[] args) {

        Batch batch = new Batch("B1",70);
        Student student = new Student(1, "Ram","HYD",batch);
        batch.setName("B4");
        System.out.println(student);
        System.out.println(batch);

        Batch b2 =student.getBatch();
        b2.setScore(100);

        System.out.println(b2);

        System.out.println(student);


    }
}
