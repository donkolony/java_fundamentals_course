package com.example.conditionals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SwitchStatementTest {

    @Test
    @DisplayName("Should evaluate the dayNumber and print Wednesday")
    void testSwitchStatement() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        SwitchStatement.main(new String[]{});

        assertEquals("Wednesday" + System.lineSeparator(), outContent.toString());

        System.setOut(System.out);
    }
}