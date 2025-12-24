package com.java.learning.loop;

public class ForEach {
    public static void main(String[] args) {
        String[] items = {"Milk", "Bread", "Eggs"};

        int[] rollNumbers = {1,6,9,10};

        for (int rollNumber : rollNumbers){

            System.out.println("The rollNumber is " + rollNumber);
        }

        for(String item : items) {
            System.out.println(item);
        }

    }
}
