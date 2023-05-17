package com.midsem;

import java.util.Arrays;

public class ArrayApp {
    public static int max(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }
    public static int maxSumIn2Arr(int[] arr1, int[] arr2) {
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
        public static String decimalToHexadecimal(int decimal) {
            if (decimal == 0) {
                return "";
            } else {
                int remainder = decimal % 16;
                char hexDigit = getHexDigit(remainder);
                int quotient = decimal / 16;
                return decimalToHexadecimal(quotient) + hexDigit;
            }
        }

        public static char getHexDigit(int decimal) {
            if (decimal < 10) {
                return (char) (decimal + '0');
            } else {
                return (char) (decimal - 10 + 'A');
            }
        }

        public static void main(String[] args) {
            //for a
            System.out.println("Answer to 'a' part");
            int[] arr1 = {1, 5, 7, 10, 12, 15, 20};
            int[] arr2 = {3, 6, 7, 11, 12, 17, 30};
            System.out.println(maxSumIn2Arr(arr1, arr2));

            // for b
            System.out.println("Answer to 'b' part");
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 9};
            int ans = findSmallestMissingPositiveNum(arr);
            System.out.println(ans);

            //for c
            System.out.println("Answer to 'c' part");
            int decimal = 255;
            String hexadecimal = decimalToHexadecimal(decimal);
            System.out.println("Hexadecimal representation: " + hexadecimal);
        }
    }


