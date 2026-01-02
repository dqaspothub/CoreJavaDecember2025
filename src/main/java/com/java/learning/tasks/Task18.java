package com.java.learning.tasks;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vehicle = sc.next().toUpperCase();

        int charge = switch(vehicle) {
            case "CAR" -> 50;
            case "BIKE" -> 20;
            case "BUS" -> 80;
            default -> 0;
        };

        System.out.println("Parking Charge: ₹" + charge);
    }
}
