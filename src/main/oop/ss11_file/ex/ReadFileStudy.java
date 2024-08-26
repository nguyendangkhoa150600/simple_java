package main.oop.ss11_file.ex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileStudy {
    public static void main(String[] args) throws IOException {
        File file = new File("main/oop/ss11_file/ex/data/input.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line;

        while((line = br.readLine()) != null)  {
            System.out.println("Line : " + line);
        }
        br.close();
    }
}
