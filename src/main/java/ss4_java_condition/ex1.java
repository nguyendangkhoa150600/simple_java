package main.java.ss4_java_condition;

public class ex1 {
	public static void main (String[] arg) {
		boolean a = true && false;
		boolean b = (3 > 100) || (25 % 5 == 0);
		boolean c = a && b;
		boolean d = !a || b;

		System.out.println("c = " + c);
        System.out.println("d = " + d);
	}
}
