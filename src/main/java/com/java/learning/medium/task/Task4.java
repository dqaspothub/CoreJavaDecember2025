package com.java.learning.medium.task;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String password = "java123";
        String input;
        int attempts = 0;

        do {
            System.out.print("Enter password: ");
            input = sc.nextLine();

            if (input.equals(password)) {
                System.out.println("Login Successful");
                return;
            }
            attempts++;
        } while (attempts < 3);

        System.out.println("Account Locked");
    }
}
