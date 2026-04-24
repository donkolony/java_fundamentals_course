package com.example.basics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class VariablesTest {

    @Test
    @DisplayName("Should correctly declare variables and print the concatenated string")
    void testVariableOutput() {
        // Setup stream to capture console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the main method
        Variables.main(new String[]{});

        // Assert the output matches exactly
        assertEquals("Java version 21 has a rating of 9.5" + System.lineSeparator(), outContent.toString());

        // Reset system output
        System.setOut(System.out);
    }
}