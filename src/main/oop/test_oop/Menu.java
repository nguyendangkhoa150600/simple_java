package main.oop.test_oop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    static ArrayList<KhachHang> danhSach = new ArrayList<>();

//    static {
//        BaoHiem bhT1 = new BaoHiemT("Bảo hiểm tử vong", "Không xác định", 1000000, "Thực hiện mai táng và chôn cất", "Đóng một lần", "09/20/2015", "Trường hợp tử kỳ", "2 tháng");
//        KhachHang kh1= new KhachHang("Tran Thi Mai", "11/12/1984", "Da Nang", "209890786", bhT1);
//        danhSach.add(kh1);
//    }

    public static void main(String[] args) throws IOException {
        readFile();

        Scanner scanner = new Scanner(System.in);
        int menuId;
        do {
            System.out.println("-- CHƯƠNG TRÌNH QUẢN BẢO HIỂM -");
            System.out.println("1. Danh sách người sử dụng bảo hiểm");
            System.out.println("2. Tìm kiếm thông tin người tham gia bảo hiểm");
            System.out.println("3. Hiển thị thông tin của tất cả các gói bảo hiểm có mức phí đóng bảo hiểm là cao nhất ");
            System.out.println("4. Thoát");

            System.out.println("Vui lòng chọn menu");
            menuId = Integer.parseInt(scanner.nextLine());

            switch (menuId) {
                case 1:
                    listBH();
                    break;

                case 2:
                    searchBH(scanner);
                    break;

                case 3:
                    searchMucPhiCaoNhat();
                    break;
            }
        } while (menuId != 4);
    }

    private static void searchMucPhiCaoNhat() {
        double price = 0;
        for (KhachHang kh : danhSach) {
            if (kh.getInsurance().getPrice() > price) {
                price = kh.getInsurance().getPrice();
            }
        }

        System.out.println("Goi bao hiem cao nhat là: ");
        for (KhachHang kh : danhSach) {
            if (kh.getInsurance().getPrice() == price) {
                kh.getInsurance().hienThiThongTinBaoHiem();
                System.out.println("-----------------------------");
            }
        }
    }

    private static void listBH() {
        for (KhachHang kh : danhSach) {
            kh.hienThiThongTin();
            System.out.println("-----------------------------");
        }
    }

    private static void searchBH(Scanner scanner) {
        String cmt;
        System.out.println("Vui lòng nhập vào số chứng mình thư: ");
        cmt = scanner.nextLine();

        KhachHang khachHangCanTim = checkCMT(cmt);

        if (khachHangCanTim != null) {
            khachHangCanTim.hienThiThongTin();
            System.out.println("-----------------------------");
        } else {
            System.out.println("Không tìm thấy khách hàng với số CMND: " + cmt);
        }
    }

    private static KhachHang checkCMT(String cmt) {
        for (KhachHang kh : danhSach) {
            if (kh.getCccd().equals(cmt)) {
                return kh;
            }
        }
        return null;
    }

    public static void readFile() throws IOException {
        String url = "src/main/oop/test_oop/data/input.csv";
        File file = new File(url);

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line;
        while((line = br.readLine()) != null) {
            String[] data = line.split(", ");
            BaoHiem baoHiem = null;
            String loaiBaoHiem = data[0];

            switch (loaiBaoHiem) {
                case "T":
                    baoHiem = new BaoHiemT(
                        data[5], data[6], Double.parseDouble(data[7]),
                        data[8], data[9], data[10],
                        data[13], data[14]
                    );
                    break;
                case "H":
                    baoHiem = new BaoHiemH(
                        data[5], data[6], Double.parseDouble(data[7]),
                        data[8], data[9], data[10],
                        data[11], data[12]
                    );
                    break;
                case "S":
                    baoHiem = new BaoHiemS(
                        data[5], data[6], Double.parseDouble(data[7]),
                        data[8], data[9], data[10],
                        data[11], data[14]
                    );
                    break;
                default:
                    System.out.println("Loại bảo hiểm không hợp lệ: " + loaiBaoHiem);
            }

            KhachHang khachHang = new KhachHang(data[1], data[2], data[3], data[4], baoHiem);
            danhSach.add(khachHang);
        }

    }
}
