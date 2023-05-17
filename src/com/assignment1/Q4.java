package com.assignment1;

public class Q4 {
    public static int binarySearch(int[] array, int key, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (array[mid] == key) {
            return mid;
        } else if (array[mid] > key) {
            end = mid;
            binarySearch(array, key, start, end);
        } else {
            start = mid + 1;
            binarySearch(array, key, start, end);
        }
        return -1;
    }

    public static int binarySearch(int[] array, int key) {
        int start = 0;
        int end = array.length - 1;
        return binarySearch(array, key, start, end);
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1, 2, 3, 4, 5}, 3));
    }
}