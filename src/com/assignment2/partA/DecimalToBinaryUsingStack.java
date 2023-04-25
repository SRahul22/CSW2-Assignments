package com.assignment2.partA;

import java.util.Stack;

public class DecimalToBinaryUsingStack {
    public static void main(String[] args) {
        int decimal = 27;
        Stack<Integer> stack = new Stack<Integer>();
        while (decimal > 0) {
            int remainder = decimal % 2;
            stack.push(remainder);
            decimal /= 2;
        }
        System.out.print("The binary equivalent of 27 is: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
