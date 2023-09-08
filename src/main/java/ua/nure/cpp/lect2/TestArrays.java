package ua.nure.cpp.lect2;

import java.util.Arrays;

public class TestArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[4];
        int[][] marr = new int[2][];
        marr[0] = new int[]{1, 2};
        marr[1] = new int[]{3, 4};

        // 1
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 2
        for (int v : arr) {
            if (v < 3) {
                System.out.println(v);
            }
        }

        // 3
        Arrays.stream(arr).forEach(System.out::println);


        int[] ints = Arrays.copyOf(arr, 5);
        for (int v : ints) {
            System.out.println(v);
        }
        for (int v : new int[] {2,5,7}) {
            System.out.println(v);
        }

        int[] intsCopy = ints;
        ints[2] = 78;
        System.out.println(intsCopy[2]);
    }
}
