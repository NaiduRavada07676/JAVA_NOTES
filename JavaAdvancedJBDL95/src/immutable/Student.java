package immutable;

//if a class becomes final we cannot inherit it

import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class Student {

    final Integer id;
    final String name;
    final String city;
    final Batch batch;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", batch=" + batch +
                '}';
    }

    public Student(Integer id, String name, String city, Batch batch) {
        this.id = id;
        this.name = name;
        this.city = city;
//        this.batch = batch;
        Batch dummy = new Batch(batch.getName(),batch.getScore());
        this.batch = dummy;
    }

    public Batch getBatch() {
        Batch dummy = new Batch(this.batch.getName(),this.batch.getScore());
        return dummy;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }


}
