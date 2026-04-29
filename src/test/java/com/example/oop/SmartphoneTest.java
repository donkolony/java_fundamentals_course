package com.example.oop;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SmartphoneTest {

    @Test
    @DisplayName("Smartphone should correctly pass brand to parent and set its own model")
    void testSmartphoneConstructor() {
        Smartphone phone = new Smartphone("Samsung", "Galaxy S24");
        assertEquals("Samsung", phone.getBrand());
        assertEquals("Galaxy S24", phone.getModel());
    }

    @Test
    @DisplayName("toString should return the formatted brand and model")
    void testSmartphoneToString() {
        Smartphone phone = new Smartphone("Google", "Pixel 8");
        assertEquals("Google Pixel 8", phone.toString());
    }
}