package com.assignment1;

public class Q13 {
    public static int max(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }

    public static int q13MaxSum(int[] arr1, int[] arr2) {
        int i = 0, j = 0, sum1 = 0, sum2 = 0, result = 0;
        while ((i < arr1.length) && (j < arr2.length)) {
            if (arr1[i] < arr2[j]) {
                sum1 += arr1[i];
                i++;
            } else if (arr1[i] > arr2[j]) {
                sum2 += arr2[j];
                j++;
            } else {
                result += max(sum1, sum2) + arr1[i];
                i++;
                j++;
                sum1 = 0;
                sum2 = 0;
            }
        }
        while (i < arr1.length) {
            sum1 += arr1[i];
            i++;
        }
        while (j < arr2.length) {
            sum2 += arr2[j];
            j++;
        }
        result += max(sum1, sum2);
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 7, 10, 12, 15, 20};
        int[] arr2 = {3, 6, 7, 11, 12, 17, 30};
        System.out.println(q13MaxSum(arr1, arr2));
    }
}
