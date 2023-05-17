package com.assignment1;

import java.util.Arrays;

public class Q5 {
    // I will upload an improved version of this problem soon
    // This is my bruteforce approach to solve the problem
    public static int[] rotateArray(int[] array) {
        if (array.length < 2) {
            return array;
        }
        int lastIndexValue = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = lastIndexValue;
        return array;
    }

    public static int[] rotateArray(int[] array, int kTimes) {
        if (kTimes < 0) {
            System.out.println("K can not be less than zero");
        }
        while (kTimes != 0) {
            rotateArray(array);
            kTimes--;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rotateArray(array, 3)));
    }
}
