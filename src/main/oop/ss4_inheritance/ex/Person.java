package main.oop.ss4_inheritance.ex;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate dayOfBirth;

    public Person(String name, LocalDate dayOfBirth) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
    }

    public void run() {
        System.out.println("Person run");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(LocalDate dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }
}
