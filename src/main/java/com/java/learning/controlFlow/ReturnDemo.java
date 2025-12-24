package com.java.learning.controlFlow;

public class ReturnDemo {

    public static void greet() {
        System.out.println("Hello");
        return;

    }

    public void mathFunctions(){

        add(10,90);
        sub(20,90);
        div(2,10);
        mul(6,8);
    }
    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int div(int a, int b) {
        return a / b;
    }
    public static int mul(int a, int b) {
        return a * b;
    }


    public static void main(String[] args) {
        int result = add(10, 20);
        System.out.println(result); // 30
        ReturnDemo ReturnDemo = new ReturnDemo();

        ReturnDemo.mathFunctions();
    }

    public static String checkResult(int marks) {
        if (marks >= 50)

            return "Pass";
        else
            return "Fail";
    }


    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Not Eligible");
            return;
        }
        System.out.println("Eligible");
    }
}