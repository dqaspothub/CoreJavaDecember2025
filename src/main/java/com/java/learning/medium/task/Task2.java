package com.java.learning.medium.task;

public class Task2 {

    public static void main(String[] args) {

        String[] names = {"Ravi", "Suresh", "Anita", "Raj", "Meghana"};

        System.out.println("Valid Names:");
        for (String name : names) {
            if (name.length() >= 5)
                System.out.println(name);
        }

        System.out.println("\nInvalid Names:");
        for (String name : names) {
            if (name.length() < 5)
                System.out.println(name);
        }
    }
}
