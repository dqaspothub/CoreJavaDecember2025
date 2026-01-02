package com.java.learning.constructor;

class Parents {
    int x = 10;
}

class Childs extends Parents {
    int x = 20;

    void display() {
        System.out.println(x);        // Child variable
        System.out.println(super.x);  // Parent variable
    }

    public static void main(String[] args) {
        Childs c = new Childs();
        c.display();
    }
}

/* Call parent class method using super
class Parent {
    void show() {
        System.out.println("Parent show method");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child show method");
    }

    void display() {
        super.show(); // calls parent method
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
*/

/*
Default super() (Implicit)

class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child constructor");
    }

    public static void main(String[] args) {
        new Child();
    }
}
*/

/*
Explicit super() with parameters

class Parent {
    Parent(int x) {
        System.out.println("Parent constructor: " + x);
    }
}

class Child extends Parent {
    Child() {
        super(100);  // calls parent parameterized constructor
        System.out.println("Child constructor");
    }

    public static void main(String[] args) {
        new Child();
    }
}
*/
