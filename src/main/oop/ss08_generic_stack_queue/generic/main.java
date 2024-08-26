package main.oop.ss08_generic_stack_queue.generic;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        // Cach 1:
        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(1);

        // Cach 2:
        ArrayList arrayList = new ArrayList();

        arrayList.add(1);
        arrayList.add("asd");

        // TInh Tong:
        int sum =  0;
        for (Object o : arrayList) {
//            Trường hợp này lỗi khi dùng cách 2, bởi vì Int không thể là String
//            sum += Integer.parseInt((String) o);

//            Trường hợp này sẽ lỗi nếu dùng cách 2, nó chỉ đúng với trong arr là số
//            sum += Integer.parseInt(o.toString());
        }

        System.out.println("Tong: " + sum);
    }
}
