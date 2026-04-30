package com.example.oop;



public class DeviceManager {

    public static void main(String[] args){

        /*
        // Upcasting: A Vehicle reference pointing to a Car object
        Vehicle myVehicle = new Car();
        // Even though the reference is 'Vehicle', Java looks at the
        // ACTUAL object type at runtime and runs the Car's version of the method.
        myVehicle.startEngine();
         */
        Device[] devices = new Device[2];
        devices[0] = new Smartphone("Apple", "iPhone 15");
        devices[1] = new Laptop("Dell");

        for (Device n: devices){
            System.out.println(n);
        }

    }
}
