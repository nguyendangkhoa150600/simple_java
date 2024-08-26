package main.oop.ss02_constructor.ex2;

public class main {
    public static void main(String[] args) {
        ThoiGian a = new ThoiGian();
        a.output();                           // 00:00:00
        ThoiGian b = new ThoiGian(7);
        b.output();                           // 07:00:00
        ThoiGian c = new ThoiGian(7, 30);
        c.output();                           // 07:30:00
        ThoiGian d = new ThoiGian(7, 30, 50);
        d.output();                           // 07:30:50
        ThoiGian f = new ThoiGian(d);
        f.output();                           // 07:30:50
    }
}
