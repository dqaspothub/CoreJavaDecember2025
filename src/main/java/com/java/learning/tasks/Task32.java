package com.java.learning.tasks;

public class Task32 {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 40, -5};

        for (int num : numbers) {
            if (num < 0) {
                System.out.println("Negative number found. Loop stopped.");
                break;
            }
            System.out.println(num);
        }
    }
}
