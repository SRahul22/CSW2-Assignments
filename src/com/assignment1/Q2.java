package com.assignment1;

public class Q2 {
    public static String decimalToBinary(int decimalNum){
        StringBuilder ans= new StringBuilder();
        boolean isNegative=false;
        if(decimalNum<0){
            decimalNum=decimalNum*-1;
            isNegative= true;
        }
        while(decimalNum!=0){
            int rem=decimalNum%2;
            decimalNum/=2;
            ans.insert(0, rem);
        }
        if(isNegative){
            ans.insert(0, "-");
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(decimalToBinary(-13));
    }
}
