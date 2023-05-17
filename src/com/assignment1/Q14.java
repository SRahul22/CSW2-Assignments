package com.assignment1;

public class Q14 {
    public static void towerOfHanoi(int num, char source, char destination, char temp) {
        if (num < 1)
            return;
        towerOfHanoi(num - 1, source, temp, destination);
        System.out.println("move " + num + "nd disk from peg " + source + " to peg " + destination);
        towerOfHanoi(num - 1, temp, destination, source);
    }

    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(3, 's', 'd', 't');
    }
}

