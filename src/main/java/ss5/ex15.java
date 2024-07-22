package main.java.ss5;

public class ex15 {
    public static void main(String[] args) {
        int h = 6;
        int w = 4;

        // a)
        // for(int i = 1; i <= h; i++ ) {
        //     for(int j = 1; j <= w; j++ ) {
        //         if(j==1 || i == 1 || i == h) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // b)
        // for(int i = 1; i <= h; i++ ) {
        //     for(int j = 1; j <= w; j++ ) {
        //         if(j==w || i == h || i == 1) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // c)
        for(int i = 1; i <= h; i++ ) {
            for(int j = 1; j <= w; j++ ) {
                if(j==1 || j == w || i == h) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
