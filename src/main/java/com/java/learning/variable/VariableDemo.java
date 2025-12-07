package com.java.learning.variable;

public class VariableDemo {

    // Instance variables
    String name;
    int age;

    // Static variable
    static String schoolName = "National Public School";

    // Method with local variable
    public  void showDetails() {
        int year = 2024; // local variable
      //  System.out.println("Name: " + name);
       // System.out.println("Age: " + age);
        System.out.println("School: " + schoolName);
        System.out.println("Year: " + year);
    }


    public static void main(String[] args) {

        VariableDemo s1 = new VariableDemo();

        s1.name = "Arun";
        s1.age = 21;

        s1.showDetails();

        System.out.println("---------------------");
    }
}
