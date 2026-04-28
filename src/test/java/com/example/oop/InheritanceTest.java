package com.example.oop;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

class InheritanceTest {

    @Test
    @DisplayName("Car should inherit from Vehicle and call parent methods")
    void testInheritance() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Car myCar = new Car();
        myCar.startEngine();
        myCar.displayInfo();

        String output = outContent.toString();
        assertTrue(output.contains("The engine is starting..."));
        assertTrue(output.contains("This is a Generic car."));

        System.setOut(System.out);
    }
}