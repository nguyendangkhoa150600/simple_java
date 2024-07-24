package main.oop.ss2_constructor.ex1;

public class main {
    public static void main(String[] args) {
        PhanSo a = new PhanSo();
        a.output();                           // 0
        PhanSo b = new PhanSo(1, 2);
        b.output();                           // 1/2
        PhanSo c = new PhanSo(3);
        c.output();                           // 3
        PhanSo d = new PhanSo(-6, -2);
        d.output();                           // 3
        PhanSo e = new PhanSo(3, -1);
        e.output();                           // -3
        PhanSo f = e.copy();
        f.cong(100);
        e.output();                           // -3
        f.output();                           // 97
    }
}
