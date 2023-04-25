package com.assignment2.partB;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet of Integer type
        TreeSet<Integer> numbers = new TreeSet<>();
        // Add some numbers to the TreeSet
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        // Display the TreeSet
        System.out.println("TreeSet: " + numbers);
        // Ask the user to enter a number and search for it in the TreeSet
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int searchNumber = scanner.nextInt();
        if (numbers.contains(searchNumber)) {
            System.out.println(searchNumber + " is present in the TreeSet.");
        } else {
            System.out.println(searchNumber + " is not present in the TreeSet. ");
        }
        // Remove an element from the TreeSet
        System.out.print("Enter a number to remove: ");
        int removeNumber = scanner.nextInt();
        if (numbers.remove(removeNumber)) {
            System.out.println(removeNumber + " removed from the TreeSet.");
            System.out.println("Updated TreeSet: " + numbers);


        } else {
            System.out.println(removeNumber + " is not present in the TreeSet.");

        }


    }
}