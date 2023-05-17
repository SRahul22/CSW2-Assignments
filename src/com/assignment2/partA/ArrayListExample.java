package com.assignment2.partA;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Choose an operation:");
            System.out.println("1. Display the list");
            System.out.println("2. Search for a number");
            System.out.println("3. Remove an element from a position");
            System.out.println("4. Add an element to the list");
            System.out.println("5. Check if the list is empty");
            System.out.println("6. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (list.isEmpty()) {
                        System.out.println("The list is empty.");
                    } else {
                        System.out.println("The list is:");
                        for (int i : list) {
                            System.out.print(i + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    if (list.isEmpty()) {
                        System.out.println("The list is empty.");
                    } else {
                        System.out.println("Enter a number to search for:");
                        int searchNum = sc.nextInt();
                        if (list.contains(searchNum)) {
                            System.out.println(searchNum + " is present in the the list.");
                        } else {

                        }
                        System.out.println(searchNum + " is not present in list. ");

                    }
                    break;
                case 3:
                    if (list.isEmpty()) {
                        System.out.println("The list is empty.");
                    } else {
                        System.out.println("Enter the position of the element to remove(starting from 0):");

                        int pos = sc.nextInt();
                        if (pos < 0 || pos >= list.size()) {
                            System.out.println("Invalid position.");
                        } else {
                            list.remove(pos);
                            System.out.println("Element removed.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter a number to add to the list: ");
                    int addNum = sc.nextInt();
                    list.add(addNum);
                    System.out.println("Element added.");
                    break;
                case 5:
                    if (list.isEmpty()) {
                        System.out.println("The list is empty.");
                    } else {
                        System.out.println("The list is not empty.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:

                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);
        sc.close();
    }
}