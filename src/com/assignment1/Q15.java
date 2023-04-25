package com.assignment1;

public class Q15 {
    public static void findGCD(int num1,int num2){
        if(num1<num2){
            int temp=num1;
            num1=num2;
            num2=temp;
        }
        if (num2==0){
            System.out.println(num1);
            return;
        }
        num1=num1%num2;
        findGCD(num1,num2);
    }

    public static void main(String[] args) {
        findGCD(54,24);
    }

}
