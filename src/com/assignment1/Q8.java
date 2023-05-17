package com.assignment1;

import java.util.Arrays;

public class Q8 {
    public static int[] arrangeArr(int[] array) {
//        Arrays.sort(array);
        int[] ans = new int[array.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = -1;
        }
        for (int i = 0; i < array.length; i++) {
            ans[array[i]] = array[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] ans = {1, 2, 2, 1, 3, 6, 7, 5, 3, 5, 6, 7};
        System.out.println(Arrays.toString(arrangeArr(ans)));
    }


}
