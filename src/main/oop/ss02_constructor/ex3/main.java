package main.oop.ss02_constructor.ex3;

public class main {
    public static void main(String[] args) {
        Student st1 = new Student(1,"Khoa", 8.8);

        System.out.println("Thong tin ban dau: ");
        System.out.println("ID: " + st1.getId());
        System.out.println("Name: " + st1.getName());
        System.out.println("Score: " + st1.getScore());

        st1.setName("Hehe");
        st1.setScore(9);

        System.out.println("Thong tin cap nhat: ");
        System.out.println("ID: " + st1.getId());
        System.out.println("Name: " + st1.getName());
        System.out.println("Score: " + st1.getScore());

        System.out.println("Check");
        st1.setName("    ");
        st1.setScore(11);
    }
}
