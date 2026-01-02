package com.java.learning.tasks;

import java.util.Scanner;

public class Task41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 5000;
        int choice;

        do {
            System.out.println("\n1. View Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Balance: " + balance);
                case 2 -> {
                    System.out.print("Enter amount: ");
                    int amt = sc.nextInt();
                    if (amt <= balance) {
                        balance -= amt;
                        System.out.println("Withdrawal Successful");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                }
                case 3 -> {
                    System.out.println("Exiting...");
                    break;
                }
                default -> System.out.println("Invalid Choice");
            }

        } while (choice != 3);
    }
}
