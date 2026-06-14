package staticFinal95;

public class Student {

    private String name;
    private Integer rollNo;
    private Double score;

    final static String university = "GFG";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

//    public static String getUniversity() {
//        return university;
//    }
//
//    public static void setUniversity(String university) {
//        Student.university = university;
//    }
}
