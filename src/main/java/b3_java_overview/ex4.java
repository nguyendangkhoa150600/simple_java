package main.java.b3_java_overview;

import java.util.Scanner;

public class ex4 {
	public static void main (String[] arg) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap diem Toan: ");
        double diemToan = scanner.nextDouble();
        System.out.print("Nhap he so Toan: ");
        double heSoToan = scanner.nextDouble();

        System.out.print("Nhap diem Ly: ");
        double diemLy = scanner.nextDouble();
        System.out.print("Nhap he so Ly: ");
        double heSoLy = scanner.nextDouble();

        System.out.print("Nhap diem Hoa: ");
        double diemHoa = scanner.nextDouble();
        System.out.print("Nhap he so Hoa: ");
        double heSoHoa = scanner.nextDouble();

        double tongDiem = (diemToan * heSoToan) + (diemLy * heSoLy) + (diemHoa * heSoHoa);
        double tongHeSo = heSoToan + heSoLy + heSoHoa;
        
        double diemTrungBinh = tongDiem / tongHeSo;

        System.out.println("Diem trung binh: " + diemTrungBinh);
	}
}
