package main.java.ss4_java_condition;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so thu 1: ");
        int a = scanner.nextInt();

        System.out.print("Nhap so thu 2: ");
        int b = scanner.nextInt();

        int temp = a;

        a = b;

        b = temp;

        System.out.print("a: "+a);
        System.out.print(" b: "+b);
    }
}
