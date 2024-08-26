package main.oop.ss04_inheritance.ex;

import java.time.LocalDate;

public class Student extends Person {
    private String clazz;

//    public Student() {
//
//    }

    public Student(String name, LocalDate dayOfBirth, String clazz) {
        super(name, dayOfBirth);
        this.clazz = clazz;
    }

    @Override
    public void run() {
        System.out.println("Student run");
    }
}
