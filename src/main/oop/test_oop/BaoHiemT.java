package main.oop.test_oop;

import java.util.Date;

public class BaoHiemT extends BaoHiem{
    private String wayT;
    private String miniumTime;

    public BaoHiemT(String name, String duration, double price, String purpose, String way, String beginTime, String wayT, String miniumTime) {
        super(name, duration, price, purpose, way, beginTime);
        this.wayT = wayT;
        this.miniumTime = miniumTime;
    }

    public String isWayT() {
        return wayT;
    }

    public void setWayT(String wayT) {
        this.wayT = wayT;
    }

    public String getMiniumTime() {
        return miniumTime;
    }

    public void setMiniumTime(String miniumTime) {
        this.miniumTime = miniumTime;
    }

    @Override
    public void hienThiThongTinBaoHiem() {
        System.out.println("Ten bao hiem: " + name);
        System.out.println("Thoi han dong: " + duration);
        System.out.println("Muc phi dong: " + price);
        System.out.println("Muc dich: " + purpose);
        System.out.println("Cach thuc dong: " + way);
        System.out.println("Thoi gian bat dau: " + beginTime);
        System.out.println("Truong hop bao hiem: " + wayT);
        System.out.println("Thoi gian toi thieu tham gia: " + miniumTime);
    }
}
