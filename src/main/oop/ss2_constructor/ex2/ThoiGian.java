package main.oop.ss2_constructor.ex2;

public class ThoiGian {
    private int hour;
    private int min;
    private int sec;

    public ThoiGian() {
        hour = 0;
        min = 0;
        sec = 0;
    }

    public ThoiGian(int hour) {
        this.hour = hour;
        min = 0;
        sec = 0;
    }

    public ThoiGian(int min, int hour) {
        this.min = min;
        this.hour = hour;
        sec = 0;
    }

    public ThoiGian(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public ThoiGian (ThoiGian a) {
        hour = a.hour;
        min = a.min;
        sec = a.sec;
    }

    public void output() {
        System.out.println("Thoi gian: "+ hour + ":" + min + ":" + sec);
    }

}
