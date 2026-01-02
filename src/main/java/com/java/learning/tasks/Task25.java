package com.java.learning.tasks;

public class Task25 {
    public static void main(String[] args) {

        String str = "Hello Java";

        // a
        System.out.println(str);

        // b
        System.out.println(str.length());

        // c
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        // d
        for(int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }

        System.out.println();

        // e
        for(char ch : str.toCharArray()) {
            System.out.print(ch + " ");
        }

        // f (count chars without length)
        int count = 0;
        for(char ch : str.toCharArray()) {
            count++;
        }
        System.out.println("\nCount = " + count);

        // g & h
        String s1 = "Java";
        String s2 = "java";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        // i Reverse
        String rev = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }
}
