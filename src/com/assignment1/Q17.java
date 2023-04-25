package com.assignment1;

public class Q17 {
    public static int binarySearch(int[] arr,int target,int start,int end){
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]>target){
                binarySearch(arr,target,mid+1,end);
            } else if(arr[mid]<target){
                binarySearch(arr,target,start,mid);
            } else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,68,5746};
        System.out.println(binarySearch(arr,5,0,arr.length-1));
    }
}
