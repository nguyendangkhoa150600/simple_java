package main.oop.test_oop;

public class KhachHang {
    private String name;
    private String birth;
    private String address;
    private String cccd;
    private BaoHiem insurance;

    public KhachHang(String name, String birth, String address, String cccd, BaoHiem insurance) {
        this.name = name;
        this.birth = birth;
        this.address = address;
        this.cccd = cccd;
        this.insurance = insurance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public BaoHiem getInsurance() {
        return insurance;
    }

    public void setInsurance(BaoHiem insurance) {
        this.insurance = insurance;
    }

    public void hienThiThongTin() {
        System.out.println("Ho ten: " + name);
        System.out.println("Ngay sinh: " + birth);
        System.out.println("Noi thuong tru: " + address);
        System.out.println("So chung minh thu: " + cccd);
        System.out.println("Ngay sinh: " + birth);
        insurance.hienThiThongTinBaoHiem();
    }
}
