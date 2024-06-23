package b3_java_overview;

import java.util.Scanner;

public class ex6 {
	public static void main (String[] arg) {
		Scanner scanner = new Scanner(System.in);
		
		String input;

        while (true) {
            System.out.print("Nhap so xe: ");
            input = scanner.nextLine();

            if (check(input)) {
                break;
            } else {
                System.out.println("Nhap sai, chi duoc nhap duoi 5 chu so");
                System.out.println("Vui long nhap lai");
            }
        }

        int point = 0;

        for (int i = 0; i < input.length(); i++) {
            char num = input.charAt(i);		// returns char at position i
            point = Integer.parseInt(String.valueOf(num)) + point;
        }

        int total = point % 10;

        System.out.println("Xe duoc " + total + " nut !");
	}

	public static boolean check(String input) {
        if (input.length() > 5) {
            return false;
        }
        return true;
    }
}
