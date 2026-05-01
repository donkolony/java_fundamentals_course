/*
Exercise Task:
Create a new class named Car in the same package.
Make Car inherit from Vehicle using the extends keyword.
Inside Car, create a public method named displayInfo().
Inside displayInfo(), print exactly: "This is a [brand] car." (Use the getBrand() method from the parent to get the brand name).
Create a main method (either in Car or a new class) where you:
Create an instance of Car.
Call the inherited startEngine() method.
Call your new displayInfo() method.
Expected Output:
The engine is starting...
This is a Generic car.
 */

package com.example.oop.inheritance;

public class Vehicle {
    private String brand = "Generic";


    public void startEngine() {
        System.out.println("The engine is starting...");
    }

    public String getBrand() {
        return brand;
    }
}

