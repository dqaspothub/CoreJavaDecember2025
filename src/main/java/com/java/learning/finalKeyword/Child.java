package com.java.learning.finalKeyword;

class Parent {

    final void show() {
        System.out.println("Final method in Parent class");
    }
}

public class Child extends Parent {
    
/*     void show() {

     }*/  // ❌ Compile-time error

    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
/*

Final method cannot be overridden
Ensures logic safety*/
