package com.assignment2.partB;
import java.util.LinkedHashSet;
public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Create a linked hash set of type double
        LinkedHashSet<Double> set = new LinkedHashSet<Double>();
        // Insert some elements into the linked hash set
        set.add(2.5);
        set.add(1.8);
        set.add(3.0);
        // Display the linked hash set
        System.out.println("Linked Hash Set: " + set);
    }
}