package com.java.learning.StringConcepts;




public class StringReplacement {

    public int add (){

        int a = 10;
        int b = 20;
        int c = a+b;

        return c;
    }
    public static void main(String[] args) {
        String str = "Java Programming";

        System.out.println("Replaced string: " + str.replace("Java", "Python"));

        String replacedChar = str.replace('a', 'o');
        System.out.println("Replaced char: " + replacedChar);
    }
}

/*
Explanation:
replace(oldChar, newChar) replaces all occurrences of oldChar with newChar.
replace(CharSequence target, CharSequence replacement) replaces all occurrences of target with replacement.*/
