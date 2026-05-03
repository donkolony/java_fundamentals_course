package com.example.oop.composition;

public class Processor {

    private String model;

    public Processor(String model) {
        this.model = model;
    }

    public void processData() {
        System.out.println("Processor " + model + " is computing...");
    }
}
