package com.java.learning.tasks;

public class Task4 {
    double pi = 3.14159;
    int approxPi;

    public void convert() {
        approxPi = (int) pi;  // explicit type casting

        System.out.println("Original Pi: " + pi);
        System.out.println("Approx Pi: " + approxPi);
    }
}
