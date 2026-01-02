package com.java.learning.tasks;


public class Task21 {
    public static void main(String[] args) {
        int[] arr = {10, 45, 22, 89, 5};

        int max = arr[0];
        for(int num : arr) {
            if(num > max) {
                max = num;
            }
        }
        System.out.println("Largest = " + max);
    }
}
