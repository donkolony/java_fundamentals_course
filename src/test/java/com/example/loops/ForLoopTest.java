package com.example.loops;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ForLoopTest {

    @Test
    @DisplayName("Should print even numbers from 2 to 10 on separate lines")
    void testForLoopOutput() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ForLoop.main(new String[]{});

        String expected = "2" + System.lineSeparator() +
                "4" + System.lineSeparator() +
                "6" + System.lineSeparator() +
                "8" + System.lineSeparator() +
                "10" + System.lineSeparator();

        assertEquals(expected, outContent.toString());

        System.setOut(System.out);
    }
}