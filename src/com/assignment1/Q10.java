package com.assignment1;

import java.util.Arrays;

public class Q10 {
    public static int[] arrangeMaxMin(int[] array) {
        Arrays.sort(array);
        int[] ans = new int[array.length];
        int j = 0;
        for (int i = 0; i < ans.length; i += 2, j++) {
            ans[i] = array[array.length - 1 - j];
        }
        j = 0;
        for (int i = 1; i < ans.length; i += 2, j++) {
            ans[i] = array[j];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] ans = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(arrangeMaxMin(ans)));
    }
}
