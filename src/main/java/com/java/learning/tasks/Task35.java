package com.java.learning.tasks;


import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPassword = "admin123";
        int attempts = 0;

        do {
            System.out.print("Enter Password: ");
            String input = sc.next();

            if (input.equals(correctPassword)) {
                System.out.println("Login Successful");
                break;
            }

            attempts++;
        } while (attempts < 5);

        if (attempts == 5) {
            System.out.println("Account Locked");
        }
    }
}
