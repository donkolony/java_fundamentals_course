package com.example.oop.interfaces;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

class InterfaceTest {

    @Test
    @DisplayName("Interface should allow polymorphic behavior across unrelated classes")
    void testInterfacePolymorphism() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Playable[] session = { new Guitar(), new VideoGame() };
        for (Playable p : session) {
            p.play();
        }

        String output = outContent.toString();
        assertTrue(output.contains("Strumming the guitar strings."));
        assertTrue(output.contains("Loading the game levels."));

        System.setOut(System.out);
    }
}