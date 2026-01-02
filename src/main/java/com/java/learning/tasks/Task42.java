package com.java.learning.tasks;


public class Task42 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //Task 42.a: Find Array Length

        System.out.println("Length: " + arr.length);

        //Task 42.b: Find Sum of Array Elements

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum: " + sum);

        //Task 42.c: Find Average Value
        double avg = (double) sum / arr.length;
        System.out.println("Average: " + avg);

        //Task 42.d: Reverse an Array

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }


    }
}
