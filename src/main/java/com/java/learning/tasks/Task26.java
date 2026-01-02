package com.java.learning.tasks;

public class Task26 {
    public static void main(String[] args) {
        String str = "Automation Testing";
        int count = 0;

        for(char ch : str.toCharArray()) {
            if("aeiouAEIOU".indexOf(ch) != -1) {
                count++;
            }
        }
        System.out.println("Vowels = " + count);
    }
}
