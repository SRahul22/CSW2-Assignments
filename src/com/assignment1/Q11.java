package com.assignment1;

import static com.assignment1.Q5.rotateArray;

public class Q11 {
    public static int q11MaxSum(int[] array){
        int max=0;
        for (int i = 0; i < array.length; i++) {
            int temp=desiredSum(rotateArray(array));
            if(max<temp){
                max=temp;
            }
        }
        return max;
    }
    public static int desiredSum(int [] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i]*(i+1);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(q11MaxSum(new int[]{3,1,2}));
    }

}
