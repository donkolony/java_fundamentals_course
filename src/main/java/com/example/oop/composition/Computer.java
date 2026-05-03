package com.example.oop.composition;

public class Computer {

    private Processor processor;

    public Computer(Processor processor) {
        this.processor = processor;
    }

    public void runTask() {
        processor.processData();
    }
}
