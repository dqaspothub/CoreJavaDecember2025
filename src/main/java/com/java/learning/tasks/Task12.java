package com.java.learning.tasks;

public class Task12 {
    public static void main(String[] args) {
        int temp = 35;

        if (temp > 40) {
            System.out.println("It's Very Hot!");
        } else if (temp > 30) {
            System.out.println("It's Warm.");
        } else if (temp > 20) {
            System.out.println("It's Pleasant.");
        } else if (temp > 10) {
            System.out.println("It's Cool.");
        } else {
            System.out.println("It's Cold!");
        }
    }
}
