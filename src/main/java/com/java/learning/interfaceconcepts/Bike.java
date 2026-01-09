package com.java.learning.interfaceconcepts;

//Java 8 default methods
interface Vehicles {

    default void fuelType() {
        System.out.println("Petrol");
    }

   // void start();

    static void display() {
        System.out.println("Static method in interface");
    }
}

class Bike implements Vehicles {

    public static void main(String[] args) {
        Bike b = new Bike();
        b.fuelType();
        Vehicles.display(); //Using interfaceName we can call static method
    }

}
