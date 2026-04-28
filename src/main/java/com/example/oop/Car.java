package com.example.oop;

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

