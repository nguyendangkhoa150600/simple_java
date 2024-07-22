package main.java.b3_java_overview;

import java.util.Scanner;

public class ex5 {
	public static void main (String[] arg) {
		Scanner scanner = new Scanner(System.in);
		
		double pi = Math.PI;
		
		System.out.print("Nhap ban kinh hinh tron: ");
		double r = Integer.parseInt(scanner.nextLine());
		
		
		System.out.println("Chu Vi: " + (2 * pi * r));
		System.out.println("Dien Tich: " + (pi * r * r));
	}
}
