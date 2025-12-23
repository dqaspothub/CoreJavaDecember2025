package com.java.learning.medium.task;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = 10000;

        while (balance > 0) {
            System.out.println("Current Balance: " + balance);
            System.out.print("Enter withdrawal amount: ");
            int amount = sc.nextInt();

            if (amount % 100 != 0) {
                System.out.println("Amount must be multiple of 100");
            } else if (amount > balance) {
                System.out.println("Insufficient balance");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful");
            }
        }

        System.out.println("Balance is zero. Transaction ended.");
    }
}
