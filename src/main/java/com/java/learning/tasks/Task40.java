package com.java.learning.tasks;

public class Task40 {
    public static void main(String[] args) {
        int[] marks = {78, 45, 30, -2, 90};
        int passCount = 0;

        for (int mark : marks) {
            if (mark < 0) {
                System.out.println("Invalid Marks Found. Stopping Evaluation.");
                break;
            }

            if (mark < 35) {
                continue;
            }

            System.out.println("Pass");
            passCount++;
        }

        System.out.println("Total Passed Students: " + passCount);
    }
}
