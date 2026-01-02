package com.java.learning.tasks;


import java.util.Scanner;

public class Task39 {
    public static void main(String[] args) {
        String[] employees = {"Ravi", "Anita", "Kumar", "Priya"};
        Scanner sc = new Scanner(System.in);
        String searchName = sc.next();
        boolean found = false;

        for (String name : employees) {
            if (name.equalsIgnoreCase(searchName)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Employee Found");
        } else {
            System.out.println("Employee Not Found");
        }
    }
}
