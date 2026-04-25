package com.example.methods;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MethodOverloadingTest {

    @Test
    @DisplayName("Should correctly call both overloaded methods and print results")
    void testOverloadedMethodsOutput() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        MethodOverloading.main(new String[]{});

        String expected = "25" + System.lineSeparator() +
                "10.0" + System.lineSeparator();

        assertEquals(expected, outContent.toString());

        System.setOut(System.out);
    }

    @Test
    @DisplayName("The overloaded methods should return the correct math calculations")
    void testOverloadedLogic() {
        assertEquals(25, MethodOverloading.calculateArea(5));
        assertEquals(10.0, MethodOverloading.calculateArea(4.0, 2.5));
    }
}