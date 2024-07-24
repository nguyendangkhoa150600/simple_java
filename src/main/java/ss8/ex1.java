package main.java.ss8;

public class ex1 {
    public static void main(String[] args) {    
        // String text = "Hello Word";
        // String text1 = "Hello";
        // String text2 = "Word";

        // StringBuffer stringBuffer = new StringBuffer(text);
        // StringBuffer strText1 = new StringBuffer(text1);
        // String output3 = strText1.append(text2).toString();

        // String output1 = stringBuffer.substring(6);
        // String output2 = text.replace("o","f");

        // System.out.println("a) : " + output1);
        // System.out.println("b) : " + output2);
        // System.out.println("c) : " + output3);

        String a = "A";
        String b = new String("A");
        String c = "A";
        b.concat("B");
        String d = c.concat("C");
        StringBuffer e = new StringBuffer("E");
        e.append("F");
        StringBuilder g = new StringBuilder("G");
        g.append("H");
        System.out.println(a + b + c + d + e + g);
    }
}
