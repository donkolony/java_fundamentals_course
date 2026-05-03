package com.example.oop.composition;

public class Main {

    public static void main(String[] args) {
        Processor i9 = new Processor("Intel i9");
        Computer pc = new Computer(i9);

        pc.runTask();
    }
}
