package b3_java_overview;

import java.util.Scanner;

public class ex6 {
	public static void main (String[] arg) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap so xe: ");
		int a = Integer.parseInt(scanner.nextLine());
		
		int first = a/10000;
		int second = (a/1000) % 10;
		int third = (a/100) % 10;
		int fourth = (a/10) % 10;
		int fifth = a % 10;
		
		int total = (first + second + third + fourth + fifth) % 10;
		
		System.out.println("Xe duoc " + total + " nut !");
	}
}
