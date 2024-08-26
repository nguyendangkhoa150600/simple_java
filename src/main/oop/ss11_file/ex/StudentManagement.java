package main.oop.ss11_file.ex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    public static void main(String[] args) {

    }

    public static void add() throws IOException {
        List<Student> students = new ArrayList<>();

        File file = new File("main/oop/ss11_file/ex/data/student.csv");

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line;

        while((line = br.readLine()) != null) {
            Student student = new Student();
            String[] data = line.split(",");

            student.setId(Integer.parseInt(data[0]));
            student.setName(data[1]);
            student.setScore(Double.parseDouble(data[2]));

            students.add(student);
        }
    }
}
