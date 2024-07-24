package main.oop.ss2_constructor.ex1;

import java.util.Scanner;

public class PhanSo {
    private int mauSo;
    private int tuSo;

    public PhanSo() {
        tuSo = 0;
        mauSo = 1;
        rutGon();
    }

    public PhanSo(int tuSo) {
        this.tuSo = tuSo;
        mauSo = 1;
        rutGon();
    }

    public PhanSo(int tuSo, int mauSo) {
        this.mauSo = mauSo;
        this.tuSo = tuSo;
        rutGon();
    }

    private void rutGon() {
        int ucln = ucln(tuSo, mauSo);
        tuSo = tuSo / ucln;
        mauSo = mauSo / ucln;

        if(mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tu so: ");
        tuSo = sc.nextInt();

        do {
            System.out.print("Mau so: ");
            mauSo = sc.nextInt();
        } while (mauSo == 0);
    }

    private int ucln(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private void tinh() {
        System.out.println("Tong hai so la: " + (tuSo + mauSo));
        System.out.println("Hieu hai so la: " + (tuSo - mauSo));
        System.out.println("Tich hai so la: " + (tuSo * mauSo));
        System.out.println("Tong hai so la: " + (tuSo / mauSo));
    }

    public void cong(int a) {
        tuSo = a * mauSo + tuSo;
        rutGon();
    }

    public PhanSo copy () {
        return new PhanSo(tuSo, mauSo);
    }

    private void setPhanSo() {
        if((tuSo < 0 && mauSo < 0) || (tuSo > 0 && mauSo > 0) || tuSo == 0) {
            System.out.println("Phan so la so duong");
        } else System.out.println("Phan so la so am");
    }

    public void output() {
        if (mauSo == 1 || tuSo == 0) {
            System.out.println("Phan so: " + tuSo);
        } else {
            System.out.println("Phan so: " + tuSo +"/" + mauSo);
        }
    }
}
