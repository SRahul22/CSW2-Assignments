package com.assignment1;

public class Q12 {
    public static int q11findIJ(int[] array) {
        int maxDist = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] > array[i]) {
                    if ((j - i) > maxDist) {
                        maxDist = j - i;
                    }
                }
            }
        }
        return maxDist;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 1};
        System.out.println(q11findIJ(arr));
    }
}
