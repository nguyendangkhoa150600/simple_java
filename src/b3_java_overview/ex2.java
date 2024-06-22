package b3_java_overview;

import java.util.Scanner;

public class ex2 {
	public static void main (String[] arg) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap a: ");
		int a = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Nhap b: ");
		int b = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Tong a va b la: " + (a + b));
		System.out.println("Hieu a va b la: " + (a - b));
		System.out.println("Tich a va b la: " + (a * b));
		System.out.println("Thuong a va b la: " + (a / b));
	}
}
