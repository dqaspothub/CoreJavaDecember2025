package com.java.learning.medium.task;

public class Task6 {
    public static void main(String[] args) {

        int[] prices = {2000, 1500, 1800, 1200};
        int total = 0;

        for (int price : prices) {
            total += price;
        }

        while (total <= 5000) {
            total -= 500;
        }

        System.out.println("Final Amount: " + total);
    }
}
