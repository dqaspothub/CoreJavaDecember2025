package com.java.learning.tasks;


public class Task23 {
    public static void main(String[] args) {
        char[] letters = {'a', 'b', 'e', 'x', 'i', 'o'};
        int count = 0;

        for(char ch : letters) {
            if("aeiouAEIOU".indexOf(ch) != -1) {
                count++;
            }
        }
        System.out.println("Vowels count = " + count);
    }
}
