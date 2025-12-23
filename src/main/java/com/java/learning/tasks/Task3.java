package com.java.learning.tasks;

public class Task3 {
    int smallNumber;
    double bigNumber = 99.99;

    public void convert() {
        // Assigning double to int requires explicit casting
        smallNumber = (int) bigNumber;

        System.out.println("bigNumber: " + bigNumber);
        System.out.println("smallNumber after casting: " + smallNumber);
    }
}
