package main.oop.ss2_constructor.ex;

public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getScore() {
        return Score;
    }

    public void setScore(Double score) {
        Score = score;
    }

    private Integer id;
    private String name;
    private Double Score;

    Student(String name) {
        this.name = name;
    }

    void output() {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
    }
}
