package com.java.learning.tasks;

public class Task34 {
    public static void main(String[] args) {
        int num = 1;

        while (true) {
            if (num % 7 == 0) {
                System.out.println("First multiple of 7 is: " + num);
                break;
            }
            num++;
        }
    }
}
