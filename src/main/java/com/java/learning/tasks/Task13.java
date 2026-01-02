package com.java.learning.tasks;

public class Task13 {
    public static void main(String[] args) {

        // 1 to 10
        for(int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        // 10 to 1
        for(int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        // Even numbers 1 to 50
        for(int i = 1; i <= 50; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        // Odd numbers 1 to 50
        for(int i = 1; i <= 50; i++) {
            if(i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
