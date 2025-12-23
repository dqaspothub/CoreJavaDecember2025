package com.java.learning.tasks;

public class Task5 {

    int num1 = 9;
    int num2 = 10;

    public void operations() {
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));
    }

    public static void main(String[] args) {

        Task5 task5 = new Task5();
        task5.operations();
    }
}
