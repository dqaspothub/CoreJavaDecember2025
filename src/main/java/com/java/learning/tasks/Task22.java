package com.java.learning.tasks;


public class Task22 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};

        int sum = 0;
        for(int num : arr) {
            sum += num;
        }

        System.out.println("Sum = " + sum);
    }
}
