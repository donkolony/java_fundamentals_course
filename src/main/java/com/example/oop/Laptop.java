/*
Exercise Task:
Create a class named DeviceManager with a main method.
Inside the main method, create a Device[] array with a size of 2.
Fill the array:
At index 0, store a new Smartphone("Apple", "iPhone 15").
At index 1, store a new Laptop("Dell").
Use an enhanced for-loop to iterate through the array.
Inside the loop, print each device object. (This will automatically trigger the polymorphic toString() method for each specific type).
Expected Output:
Apple iPhone 15
Dell Laptop
 */

package com.example.oop;

public class Laptop extends Device {
    public Laptop(String brand) {
        super(brand);
    }

    @Override
    public String toString() {
        return getBrand() + " Laptop";
    }

}