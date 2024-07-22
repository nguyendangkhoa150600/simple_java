package main.oop.ex1;

import main.oop.ex.student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong: ");
        int num = sc.nextInt();
        ArrayList<Student> sts = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            System.out.println("########## Nhap thong tin sinh vien ###############");
            Student st = new Student();
            st.input();
            sts.add(st);
        }

        for (int i = 0; i < num; i++) {
            System.out.printf("######## Thong tin Sinh vien %d ########### \n", i + 1);
            sts.get(i).output();
        }
    }
}
