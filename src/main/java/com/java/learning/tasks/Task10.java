package com.java.learning.tasks;

public class Task10 {

    public static void main(String[] args) {
        int age = 17;

        // Voting
        String voting = (age >= 18) ? "Eligible" : "Not Eligible";

        // Driving
        String driving = (age >= 18) ? "Drive" : "Not Drive";

        System.out.println("Voting: " + voting);
        System.out.println("Driving: " + driving);
    }
}
