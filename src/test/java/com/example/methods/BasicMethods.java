package com.example.methods;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BasicMethodsTest {

    @Test
    @DisplayName("Method should correctly multiply two numbers and print the result")
    void testMultiplyMethod() {
        // Test the console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        BasicMethods.main(new String[]{});

        assertEquals("20" + System.lineSeparator(), outContent.toString());

        System.setOut(System.out);
    }

    @Test
    @DisplayName("The multiply method should return the correct mathematical product")
    void testMultiplyLogic() {
        // Test the method logic directly
        assertEquals(20, BasicMethods.multiply(5, 4));
        assertEquals(0, BasicMethods.multiply(10, 0));
        assertEquals(-15, BasicMethods.multiply(3, -5));
    }
}