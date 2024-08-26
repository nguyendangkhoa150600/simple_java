package main.oop.ss01.ex;

import java.util.Scanner;

public class student {
    String name;
    int age;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tên: ");
        name = sc.nextLine();

        System.out.println("Nhập tuổi: ");
        age = Integer.parseInt(sc.nextLine());
    }

    void output() {
        System.out.println("Tên" + name);
        System.out.println("Tuổi" + age);
    }

}
