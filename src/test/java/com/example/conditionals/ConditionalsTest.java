package com.example.conditionals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ConditionalsTest {

    @Test
    @DisplayName("Should evaluate the score and print the passing message")
    void testIfElseStatement() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Conditionals.main(new String[]{});

        assertEquals("Assessment Passed!" + System.lineSeparator(), outContent.toString());

        System.setOut(System.out);
    }
}