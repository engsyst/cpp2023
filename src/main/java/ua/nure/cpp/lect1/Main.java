package ua.nure.cpp.lect1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int a = 45;
        float f = 45f;
        double d = 45d;
        byte b = 1;
        byte b1 = 1;
        byte b2 = (byte) (b + b1);

        int[] arr = {1, 2, 3};
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[4];
        int[][] marr = new int[2][];
        marr[0] = new int[]{1, 2};
        marr[1] = new int[]{3, 4};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int v : arr) {
            if (v < 3) {
                System.out.println(v);
            }
        }
    }
}