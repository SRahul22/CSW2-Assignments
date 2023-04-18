package com.assignment1;

import java.util.Arrays;
import java.util.Collections;

public class Q7 {
    public static int[] waveForm(int[] array){
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        Collections.reverse(Arrays.asList(array));
        int mid= (array.length+1)/2;
        int ans[]=new int[array.length];
        int j=0;
        for (int i = 1; i < array.length; i+=2,j++ ){
            ans[i]=array[j];
        }
        for (int i = 0; i < array.length; i+=2,j++ ){
            ans[i]=array[j];
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(waveForm(new int[]{1,2,3,4,5,6,7})));
    }
}
