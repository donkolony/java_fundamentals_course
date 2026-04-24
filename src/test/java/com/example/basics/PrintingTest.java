package com.example.basics;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PrintingTest {

    @Test
    void printsHelloJava() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        // Call the main method of your Printing class
        Printing.main(new String[]{});

        assertEquals("Hello Java!", output.toString().trim());
    }
}