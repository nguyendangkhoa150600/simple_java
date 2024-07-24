package main.oop.ss2_constructor.ex3;

public class Student {
    private int id;
    private String name;
    private double score;

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score >= 0 && score <= 10) {
            this.score = score;
        } else System.out.println("Invalid score");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.trim().equals(" ")) {
            this.name = name;
        } else System.out.println("Invalid name");
    }
}
