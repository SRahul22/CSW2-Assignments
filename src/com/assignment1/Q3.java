package com.assignment1;

public class Q3 {
    public static int reverseNum(int num) {
        long ans = 0;
        while (num != 0) {
            int rem = num % 10;
            ans = ans * 10 + rem;
            num = num / 10;
        }
        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            System.out.println("Reverse is out of range to be considered as a Integer");
            return 0;
        }
        if (num < 0) {
            return (int) (-1 * ans);
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        System.out.println(reverseNum(1293));
    }
}
