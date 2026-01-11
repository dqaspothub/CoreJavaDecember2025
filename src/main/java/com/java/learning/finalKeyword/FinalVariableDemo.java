package com.java.learning.finalKeyword;

public class FinalVariableDemo {

    public static void main(String[] args) {

        final int MAX_MARKS = 100;

        System.out.println("Max Marks: " + MAX_MARKS);

        // MAX_MARKS = 120;  // ❌ Compile-time error
    }
}

/*
MAX_MARKS is constant
Reassigning it causes compile-time error*/
