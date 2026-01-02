package com.java.learning.tasks;

public class Task53 {
    public static void main(String[] args) {
        int[][][] sales = {
                {{100, 200}, {150, 250}},
                {{300, 400}, {350, 450}}
        };

        for (int year = 0; year < sales.length; year++) {
            int yearlyTotal = 0;
            for (int month = 0; month < sales[year].length; month++) {
                for (int product = 0; product < sales[year][month].length; product++) {
                    yearlyTotal += sales[year][month][product];
                }
            }
            System.out.println("Year " + year + " Total Sales: " + yearlyTotal);
        }

    }}