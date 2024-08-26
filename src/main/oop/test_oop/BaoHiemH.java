package main.oop.test_oop;

import java.util.Date;

public class BaoHiemH extends BaoHiem{
    private String endTime;
    private String other;

    public BaoHiemH(String name, String duration, double price, String purpose, String way, String beginTime, String endTime, String other) {
        super(name, duration, price, purpose, way, beginTime);
        this.endTime = endTime;
        this.other = other;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public void hienThiThongTinBaoHiem() {
        System.out.println("Ten bao hiem: " + name);
        System.out.println("Thoi han dong: " + duration);
        System.out.println("Muc phi dong: " + price);
        System.out.println("Muc dich: " + purpose);
        System.out.println("Cach thuc dong: " + way);
        System.out.println("Thoi gian bat dau: " + beginTime);
        System.out.println("Thoi gian ket thuc: " + endTime);
        System.out.println("San pham bao hiem di kem: " + other);
    }
}
