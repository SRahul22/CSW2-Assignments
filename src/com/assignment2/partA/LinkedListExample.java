package com.assignment2.partA;

import java.util.LinkedList;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private double mark;

    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMark() {
        return mark;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Mark: " + mark;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student other = (Student) obj;
            return this.name.equals(other.name) && this.age == other.age && this.mark == other.mark;
        }
        return false;
    }

    public static class LinkedListExample {
        public static void main(String[] args) {
            LinkedList<Student> list = new LinkedList<Student>();
            Scanner sc = new Scanner(System.in);
            int choice;
            do {
                System.out.println("Choose an operation:");
                System.out.println("1. Display the list");
                System.out.println("2. Search for a student");
                System.out.println("3. Remove a student");
                System.out.println("4. Count the number of students");
                System.out.println("5. Exit");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        if (list.isEmpty()) {
                            System.out.println("The list is empty.");
                        } else {
                            System.out.println("The list is:");
                            for (Student s : list) {
                                System.out.println(s);
                            }
                        }
                        break;
                    case 2:
                        if (list.isEmpty()) {
                            System.out.println("The list is empty.");
                        } else {

                            System.out.println("Enter the details of the student to search for:");
                            System.out.print("Name: ");
                            String name = sc.next();
                            System.out.print("Age: ");
                            int age = sc.nextInt();
                            System.out.print("Mark: ");
                            double mark = sc.nextDouble();
                            Student searchStudent = new Student(name, age, mark);
                            if (list.contains(searchStudent)) {
                                System.out.println("The student exists in the  list.");

                            } else {
                                System.out.println("The student does not exist in the list.");

                            }


                        }
                        break;
                    case 3:
                        if (list.isEmpty()) {
                            System.out.println("The list is empty.");
                        } else {
                            System.out.println("Enter the details of the student to remove:");
                            System.out.print("Name: ");
                            String name = sc.next();
                            System.out.print("Age: ");
                            int age = sc.nextInt();
                            System.out.print("Mark: ");
                            double mark = sc.nextDouble();
                            Student removeStudent = new Student(name, age, mark);
                            if (list.remove(removeStudent)) {
                                System.out.println("The student has been removed from the list. ");
                            } else {
                                System.out.println("The student does not exist in the list");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("The number of students in the list is" + list.size() + ".");
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } while (choice != 5);
            sc.close();
        }
    }
}

