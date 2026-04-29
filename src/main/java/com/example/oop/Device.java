/*
Exercise Task:
Create a subclass named Smartphone that extends Device.
Inside Smartphone, create a private String model.
Create a constructor for Smartphone that accepts two parameters: String brand and String model.
Use super(brand) as the very first line to pass the brand name to the Device constructor.
Initialize the model field with the provided parameter.
Create a public getter for the model called getModel().
Override the toString() method in Smartphone to return exactly: "[brand] [model]" (e.g., "Apple iPhone 15").
 */

package com.example.oop;

public class Device {
    private String brand;

    public Device(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}