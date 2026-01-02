package com.java.learning.tasks;

public class Task33 {
    public static void main(String[] args) {
        char[] attendance = {'P', 'A', 'P', 'A', 'P'};
        int presentCount = 0;

        for (char status : attendance) {
            if (status == 'A') {
                continue;
            }
            presentCount++;
        }

        System.out.println("Present Students Count: " + presentCount);
    }
}
