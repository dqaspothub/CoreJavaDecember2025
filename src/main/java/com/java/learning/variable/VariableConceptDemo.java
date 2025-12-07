package com.java.learning.variable;

public class VariableConceptDemo {

    String name = "Arun";
    int age = 26;

    static String workPace = "TCS";

    public void Subraction(){

        int a = 20;
        int b = 40;
        int c = a-b;
        System.out.println(c);

    }

    public static void main(String[] args) {

        VariableConceptDemo variableConceptDemo = new VariableConceptDemo();

        variableConceptDemo.Subraction();

/*        int num1 = 10;
        int num2 = 20;
        int num3 = num1+num2;
        System.out.println("The addition of two numbers " + num3);*/

    }
}
