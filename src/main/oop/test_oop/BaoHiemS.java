package main.oop.test_oop;

import java.util.Date;

public class BaoHiemS extends BaoHiem{
    private String endTime;
    private String allowanceTime;

    public BaoHiemS(String name, String duration, double price, String purpose, String way, String beginTime, String endTime, String allowanceTime) {
        super(name, duration, price, purpose, way, beginTime);
        this.endTime = endTime;
        this.allowanceTime = allowanceTime;
    }

    public String getAllowanceTime() {
        return allowanceTime;
    }

    public void setAllowanceTime(String allowanceTime) {
        this.allowanceTime = allowanceTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
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
        System.out.println("Thoi gian tro cap: " + allowanceTime);
    }
}
