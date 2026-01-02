package com.java.learning.constructor;

public class ConstructorDemoClass {

    String name;

    ConstructorDemoClass() {
        this(101);  // calls parameterized constructor
        System.out.println("No Arg constructor");
    }

    ConstructorDemoClass(int id) {
        this(29,"TVK");
        System.out.println("Employee ID: " + id);
    }
    ConstructorDemoClass(String value) {
        System.out.println("Employee ID: " + value);
    }

    ConstructorDemoClass(int age,String schoolName) {
        System.out.println("Employee age: " + age+ "and " +schoolName);
    }


    void greetings(String name){
        this.name = name;
        System.out.println(name);
    }

    void welcome(String name,int age){
        this.greetings("Kanna");
        System.out.println("Hello " +name + "and " + age);
    }

    public static void main(String[] args) {

        ConstructorDemoClass ConstructorDemoClass = new ConstructorDemoClass();

        //ConstructorDemoClass.welcome("kanna",29);
    }
}
