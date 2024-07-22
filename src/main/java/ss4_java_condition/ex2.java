package main.java.ss4_java_condition;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so: ");
        int num = scanner.nextInt();

        String eng;
        switch (num) {
            case 1:
                eng = "One";
                break;
            case 2:
                eng = "Two";
                break;
            case 3:
                eng = "Three";
                break;
            case 4:
                eng = "Four";
                break;
            case 5:
                eng = "Five";
                break;
            case 6:
                eng = "Six";
                break;
            case 7:
                eng = "Seven";
                break;
            case 8:
                eng = "Eight";
                break;
            case 9:
                eng = "Nine";
                break;
            default:
                eng = "Ten";
                break;
        }
        System.out.println(num + " Tieng Anh la: " + eng);
    }
}
