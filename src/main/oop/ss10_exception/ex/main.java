package main.oop.ss10_exception.ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    // exception phá vỡ luồn thực thi, biến không t hể thành có thể
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        do {
            try {
                int x = 1/0;

                System.out.println("Enter number: ");
                n = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                sc.nextLine();
                e.printStackTrace();    // xem lỗi là gì
            } catch (ArithmeticException e) {
                System.out.println("cannot divide by zero");
                sc.nextLine();
            }
        } while (true);
        System.out.println("n = " + n);
    }
}
