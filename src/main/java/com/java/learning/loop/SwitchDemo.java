package com.java.learning.loop;


public class SwitchDemo {

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // division by zero
        } catch (Exception e) {
            System.out.println("Cannot divide by zero!");
        } finally{
            System.out.println("No matter I will execute always");
        }
    }
}

    /*int choice = 2;
    String productName;

    productName = switch (choice) {
        case 1 : yield  "Rahul gets Vanilla";
        case 2 : yield "Rahul gets Chocolate";
        case 3 : yield "Rahul gets Strawberry";
        case 4 : yield  "Rahul gets Mango";
        default : yield "Invalid choice";
    };

        System.out.println(productName);
}*/