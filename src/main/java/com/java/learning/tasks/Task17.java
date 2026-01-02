package com.java.learning.tasks;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String signal = sc.next().toUpperCase();

        String action = switch(signal) {
            case "RED" -> "Stop";
            case "GREEN" -> "Go";
            case "YELLOW" -> "Slow Down";
            default -> "Invalid Signal";
        };

        System.out.println(action);
    }
}
