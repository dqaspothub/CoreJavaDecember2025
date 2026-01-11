package com.java.learning.finalKeyword;

final class Security {

    void secureData() {
        System.out.println("Security logic executed");
    }
}

public class TestFinalClass {

    public static void main(String[] args) {
        Security s = new Security();
        s.secureData();
    }
}

//class Hack extends Security { }  // ❌ error

/*
Security class cannot be inherited
        Used for critical classes*/
