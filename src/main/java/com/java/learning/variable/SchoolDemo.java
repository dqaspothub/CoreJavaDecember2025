package com.java.learning.variable;

public class SchoolDemo {

    //1.We need to declare a variable for product Name
    //2.Same for Price
    //3.Need to create a method for GetProductDetails
    //4.Create a static variable for Brand

    String productName = "Milk";
    int amount = 45;
    static String brand= "Awin";

    public void GetProductDetails(){
        char size ='M';

        System.out.println("The Product Name is " + productName);
        System.out.println("The Amount is " + amount);
        System.out.println("The Brand Name is " + brand);
        System.out.println("The t-shirt size is " + size);
    }

    public static void main(String[] args) {

        SchoolDemo s1 = new SchoolDemo();
        s1.GetProductDetails();
    }
}
