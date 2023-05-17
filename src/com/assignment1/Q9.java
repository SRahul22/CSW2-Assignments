package com.assignment1;

import java.util.Arrays;

public class Q9 {
    public static int findSmallestMissingPositiveNum(int[] array) {
        Arrays.sort(array);
        int[] ans = new int[array.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = -1;
        }
        for (int i = 0; i < array.length; i++) {
            try {
                ans[array[i]] = array[i];
            } catch (Exception e) {

            }
        }
        int i = 1;
        while ((i < ans.length) && (ans[i] != -1)) {
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 9};
        int ans = findSmallestMissingPositiveNum(arr);
        System.out.println(ans);
    }
}
