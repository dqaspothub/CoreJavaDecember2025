package com.java.learning.interfaceDemo;

public class SBI implements IOB {

    @Override
    public void creditCard() {
        System.out.println("Credit Card payment");
    }

    @Override
    public void debitCard() {

        System.out.println("Debit card payment");
    }

    public void savings(){
        System.out.println("Saving Account");
    }
    public static void main(String[] args) {

//        RBI obj = new RBI();

        RBI obj = new SBI();
        obj.creditCard();
        obj.creditCard();

        SBI obj2 = new SBI();
        obj2.creditCard();
        obj2.debitCard();
        obj2.savings();

    }

    @Override
    public void homeLoan() {
        System.out.println("homeloan");
    }
}
