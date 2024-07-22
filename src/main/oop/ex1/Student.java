package main.oop.ex1;

import java.util.Scanner;

public class Student {
    String name;
    double mathScore ;
    double literatureScore  ;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tên: ");
        name = sc.nextLine();

        System.out.println("Nhập diem toan: ");
        mathScore = sc.nextDouble();

        System.out.println("Nhập diem van: ");
        literatureScore = sc.nextDouble();
    }

    void output() {
        System.out.println("Tên: " + name);
        System.out.println("Diem trung binh: " + calculateAverageScore());
    }

    double calculateAverageScore() {
        return (mathScore + literatureScore) / 2;
    }
}
