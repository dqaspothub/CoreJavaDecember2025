package com.java.learning.medium.task;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("You: ");
        String input = sc.nextLine().toLowerCase();

        switch (input) {
            case "hi":
                System.out.println("Bot: Hello!");
                break;
            case "bye":
                System.out.println("Bot: Goodbye!");
                break;
            case "help":
                System.out.println("Bot: How can I assist you?");
                break;
            default:
                System.out.println("Bot: Invalid input");
        }
    }
}
