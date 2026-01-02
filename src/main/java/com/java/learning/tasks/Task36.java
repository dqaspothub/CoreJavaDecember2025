package com.java.learning.tasks;

public class Task36 {
    public static void main(String[] args) {
        int[] prices = {300, 1200, 450, 800, 600};
        int total = 0;

        for (int price : prices) {
            if (price < 500) {
                continue;
            }
            total += price;
        }

        System.out.println("Total Price (≥500): " + total);
    }
}
