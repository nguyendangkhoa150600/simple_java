package main.oop.ss11_file.ex;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileSudy {
    public static void main(String[] args) throws IOException {
        File file = new File("main/oop/ss11_file/ex/data/output.txt");
        FileWriter fw = new FileWriter(file, true);

        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Hello wworld");

        bw.close();
    }
}
