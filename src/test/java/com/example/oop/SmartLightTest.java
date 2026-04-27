package com.example.oop;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SmartLightTest {

    @Test
    @DisplayName("Constructor should use setter to cap brightness at 100")
    void testConstructorCapping() {
        SmartLight light = new SmartLight("Bedroom", 150);
        assertEquals(100, light.getBrightness());
    }

    @Test
    @DisplayName("Setter should floor brightness at 0 for negative values")
    void testSetterFlooring() {
        SmartLight light = new SmartLight("Hallway", 50);
        light.setBrightness(-10);
        assertEquals(0, light.getBrightness());
    }

    @Test
    @DisplayName("Chained constructor should use default brightness of 50")
    void testDefaultBrightness() {
        SmartLight light = new SmartLight("Garden");
        assertEquals(50, light.getBrightness());
    }

    @Test
    @DisplayName("Should allow valid brightness settings between 0 and 100")
    void testValidSetter() {
        SmartLight light = new SmartLight("Office", 20);
        light.setBrightness(75);
        assertEquals(75, light.getBrightness());
    }
}