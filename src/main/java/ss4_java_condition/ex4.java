package main.java.ss4_java_condition;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so thu 1: ");
        int a = scanner.nextInt();

        System.out.print("Nhap so thu 2: ");
        int b = scanner.nextInt();

        int max;
        int min;
        if(a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }

        System.out.print("so lon nhat: "+ max);
        System.out.print(" So nho nhat: "+ min);
    }
}
