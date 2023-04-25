package com.assignment2.partA;

import java.util.Stack;

public class PostfixEvaluationUsingStack {
    public static int evaluatePostfix(String postfix) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                switch (ch) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String postfix = "53+82-*";
        int result = evaluatePostfix(postfix);
        System.out.println("The result of " + postfix + " is " + result + ".");
    }
}