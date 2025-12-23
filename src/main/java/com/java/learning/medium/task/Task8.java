package com.java.learning.medium.task;

public class Task8 {
    public static void main(String[] args) {

        char[] attendance = {'P', 'A', 'P', 'P', 'A'};
        int present = 0;
        int absent = 0;

        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i] == 'P')
                present++;
        }

        System.out.println("Present: " + present);

        for (char status : attendance) {
            if (status == 'A')
                absent++;
        }

        System.out.println("Absent: " + absent);
    }
}
