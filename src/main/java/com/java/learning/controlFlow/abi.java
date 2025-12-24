package com.java.learning.controlFlow;

public class abi {


    public static void main(String[] args) {
        int month = 1;
        switch(month)
        {
            case 1 :
                System.out.println("Jan");
                break;
            case 2 :
                System.out.println("Feb");
                break;
            case 3 :
                System.out.println("March");
                break;
            case 4 :
                System.out.println("April");
                break;
            default:
                System.out.println("Other Month");
        }


    }
}


/*
public class DiscountCalculator {
    public static void main(String[] args) {

        String userType = "STUDENT";

        int discount = switch (userType) {

            case "EMPLOYEE" -> 30;

            case "STUDENT" -> {
                int base = 10;
                int bonus = 5;
                yield base + bonus; // multiple steps, so use yield
            }

            case "VIP" -> 50;

            default -> 0;
        };

        System.out.println("Discount: " + discount + "%");
    }
}
*/
