package main.java.ss4_java_condition;

public class ex5 {
    public static void main(String[] args) {
        int h = 6;
        int w = 4;

        for(int i = 1; i <= h; i++ ) {
            for(int j = 1; j <= w; j++ ) {
                if(j==1 || j == w || i == 1 || i == h) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
