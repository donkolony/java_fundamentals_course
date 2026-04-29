package com.example.oop;

public class Smartphone extends Device {
    private String model;

    public Smartphone(String brand, String model){
        super(brand);
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    @Override
    /*
     Need to override this method because it's inside the object class
     If a class does not extend anything, it implicitly extends Object (Device extends Object)
     Smartphone extends Device
     Therefore Smartphone inherits everything from Device AND everything from Object.
     The class Object has a method name public String toString() which prints the class name and memory address e.g., (Smartphone@abc123)

     When you override
     The method you're overriding the new method needs to have the same name, parameters, return type
     */
    public String toString(){
        return getBrand() + " " +  model;
    }
}
