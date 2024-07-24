package main.java.ss10;

public class ex {
    public static void main(String[] args) {
        int [] arr = {10, 4, 7, -200, -100};

        arr = sort(arr, 2,  10);
        System.out.println("sort: " + arr);
    }

    // public static void sort(int[] arr) {
    //     for(int i=0; i < arr.length; i++) {
    //         for(int j=0; j + 1 < arr.length; j++) {
    //             if(arr[i] > arr[j]) {
    //                 int temp = arr[i];
    //                 arr[i] = arr[j];
    //                 arr[j] = temp;
    //             }
    //         }
    //     }
    // }

    static int[] sort(int[] arr, int index, int val) {
        int[] brr = new int[arr.length + 1];

        for(int i=0; i < brr.length; i++) {
            if(i == index -1) {
                brr[i] = val;
                i++;
            } else {
                brr[i] = arr[i];
            }
        }

        return brr;
    }
}
