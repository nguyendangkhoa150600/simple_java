package main.java.b3_java_overview;

import java.util.Scanner;

public class ex3 {
	public static void main (String[] arg) {
		Scanner scanner = new Scanner(System.in);
		
		double vat = 0.1;
		
		System.out.print("Nhap ten san pham: ");
		String name = scanner.nextLine();
		
		System.out.print("Nhap so luong: ");
		int quantity = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Nhap don gia: ");
		int price = Integer.parseInt(scanner.nextLine());
		
		int total = quantity * price;
		
		
		System.out.println("Ten san pham: " + name);
		System.out.println("Tong tien: " + total);
		System.out.println("Thue phai tra: " + (total * vat));
	}
}
