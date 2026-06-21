package immutable;

public class Batch {

    private String name;
    private Integer score;

    @Override
    public String toString() {
        return "Batch{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public Batch(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
