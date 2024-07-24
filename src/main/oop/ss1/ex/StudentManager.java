package main.oop.ss1.ex;

import java.util.ArrayList;

public class StudentManager {
    public static void main(String[] args) {
        int num = 2;

        ArrayList<student> sts = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            System.out.println("########## Nhap thong tin sinh vien ###############");
            student st = new student();
            st.input();
            sts.add(st);
        }

        for (int i = 0; i < num; i++) {
            System.out.printf("######## Thong tin Sinh vien %d ###########", i + 1);
            sts.get(i).output();
        }
    }
}
