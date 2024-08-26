package main.oop.ss01.ex2;

import java.util.Scanner;

public class PhanSo {
    int mauSo;
    int tuSo;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tu so: ");
        tuSo = sc.nextInt();

        do {
            System.out.print("Mau so: ");
            mauSo = sc.nextInt();
        } while (mauSo == 0);
    }

    int ucln(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    void tinh() {
        System.out.println("Tong hai so la: " + (tuSo + mauSo));
        System.out.println("Hieu hai so la: " + (tuSo - mauSo));
        System.out.println("Tich hai so la: " + (tuSo * mauSo));
        System.out.println("Tong hai so la: " + (tuSo / mauSo));
    }

    void setPhanSo() {
        if((tuSo < 0 && mauSo < 0) || (tuSo > 0 && mauSo > 0) || tuSo == 0) {
            System.out.println("Phan so la so duong");
        } else System.out.println("Phan so la so am");
    }

    void output() {
        int rutGon = ucln(tuSo, mauSo);
        System.out.println("Phan so: " + tuSo / rutGon +"/" + mauSo / rutGon);
        tinh();
    }
}
