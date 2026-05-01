package com.example.oop;

import com.example.oop.inheritance.Vehicle;

public class Car extends Vehicle {
    public void displayInfo(){
//        String b = getBrand();
        System.out.println("This is a " + getBrand() + " car.");
    }

    public static void main(String[] args){
        // create instance of Car
        Car myCar = new Car();

        myCar.startEngine();
        myCar.displayInfo();
    }
}

