package com.example.conditionals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MultipleConditionsTest {

    @Test
    @DisplayName("Should evaluate multiple conditions and print the correct missing ticket message")
    void testLogicalOperators() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        MultipleConditions.main(new String[]{});

        assertEquals("Please buy a ticket." + System.lineSeparator(), outContent.toString());

        System.setOut(System.out);
    }
}