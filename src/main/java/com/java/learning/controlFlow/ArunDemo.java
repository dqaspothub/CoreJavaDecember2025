package com.java.learning.controlFlow;

public class ArunDemo {


    static int c ;

    public static int Addition(){

        double a = 20.90;
        double b = 20.00;
        c = (int) (a+b);

        System.out.println("The Addition of two Numbers " +c);
        return c;
    }

    public static void main(String[] args) {

       Addition();
       int d = c+5;
        System.out.println("The final balance ");
    }
}
