package main.oop.test_oop;

import java.util.Date;

public abstract class BaoHiem {
    protected  String name;
    protected  String duration;
    protected  double price;
    protected  String purpose;
    protected  String way;
    protected  String beginTime;

    public BaoHiem(String name, String duration, double price, String purpose, String way, String beginTime) {
        this.name = name;
        this.duration = duration;
        this.price = price;
        this.purpose = purpose;
        this.way = way;
        this.beginTime = beginTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String isWay() {
        return way;
    }

    public void setWay(boolean type) {
        this.way = way;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public abstract void hienThiThongTinBaoHiem();
}
