package com.example.loops;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WhileLoopTest {

    @Test
    @DisplayName("Should countdown from 5 to 1 and print Liftoff!")
    void testWhileLoopCountdown() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        WhileLoop.main(new String[]{});

        String expected = "5" + System.lineSeparator() +
                "4" + System.lineSeparator() +
                "3" + System.lineSeparator() +
                "2" + System.lineSeparator() +
                "1" + System.lineSeparator() +
                "Liftoff!" + System.lineSeparator();

        assertEquals(expected, outContent.toString());

        System.setOut(System.out);
    }
}