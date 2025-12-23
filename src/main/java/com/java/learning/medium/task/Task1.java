package com.java.learning.medium.task;

public class Task1 {
    public static void main(String[] args) {

        int[] marks = {65, 45, 80, 55, 40};

        int total = 0;
        int highest = marks[0];
        int lowest = marks[0];

        for (int i = 0; i < marks.length; i++) {
            total += marks[i];

            if (marks[i] > highest)
                highest = marks[i];

            if (marks[i] < lowest)
                lowest = marks[i];
        }

        double average = total / (double) marks.length;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Highest Mark: " + highest);
        System.out.println("Lowest Mark: " + lowest);

        if (average >= 50)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");
    }
}
