package com.java.learning.tasks;


import java.util.Scanner;

public class Task37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 5000;

        while (balance > 0) {
            System.out.print("Enter withdrawal amount (0 to cancel): ");
            int amount = sc.nextInt();

            if (amount == 0) {
                System.out.println("Transaction Cancelled");
                break;
            }

            if (amount <= balance) {
                balance -= amount;
                System.out.println("Remaining Balance: " + balance);
            } else {
                System.out.println("Insufficient Balance");
            }
        }
    }
}
