package main.java.b3_java_overview;
import java.util.Scanner;
import java.time.LocalDate;

public class ex1 {
	public static void main (String[] arg) {
		Scanner scanner = new Scanner(System.in);
		
		int now = LocalDate.now().getYear();
		
		System.out.print("Nhap nam sinh: ");
		int year = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Tuoi cua ban la: " + (now - year));
	}
}
