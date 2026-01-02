package com.java.learning.tasks;

public class Task51 {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

// Row Sum
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += mat[i][j];
            }
            System.out.println("Row " + i + " Sum: " + rowSum);
        }

// Column Sum
        for (int j = 0; j < 3; j++) {
            int colSum = 0;
            for (int i = 0; i < 3; i++) {
                colSum += mat[i][j];
            }
            System.out.println("Column " + j + " Sum: " + colSum);
        }


    }}