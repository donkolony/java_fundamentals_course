/*
THE CONSTRUCTOR GATEKEEPER
Task:
Create private fields: String name and double price.
Master Constructor: Product(String name, double price). Add logic here: if price < 0, set it to 0.0.
Chained Constructor: Product(String name). Use this() to call the master constructor with a default price of 0.0.
Create getters for both.
 */

package com.example.oop;

public class Product {

    private String name;
    private double price;


    // Chained constructor
    public Product(String name){
        this(name, 0.0);
    }

    // Master Constructor
    public Product(String name, double price){
        this.name = name;
        /*
        Price cannot be neg
        The price logic is inside the constructor
         */
        if (price < 0.0) {
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice(){
        return price;
    }
}
