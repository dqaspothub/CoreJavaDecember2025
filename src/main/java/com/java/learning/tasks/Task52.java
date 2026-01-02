package com.java.learning.tasks;

public class Task52 {
    public static void main(String[] args) {
        int[][] salary = {
                {10000, 12000, 11000},
                {15000, 14000, 13000},
                {9000, 10000, 9500}
        };

        int highestTotal = 0;
        int bestEmployee = 0;

        for (int i = 0; i < salary.length; i++) {
            int total = 0;
            for (int j = 0; j < salary[i].length; j++) {
                total += salary[i][j];
            }
            System.out.println("Employee " + i + " Total: " + total);

            if (total > highestTotal) {
                highestTotal = total;
                bestEmployee = i;
            }
        }

        System.out.println("Highest Salary Employee: " + bestEmployee);

    }}