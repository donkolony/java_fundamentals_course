package com.example.oop;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductTest {

    @Test
    @DisplayName("Should set price correctly for valid positive value")
    void testValidPrice() {
        Product p = new Product("Smartphone", 999.99);
        assertEquals(999.99, p.getPrice());
        assertEquals("Smartphone", p.getName());
    }

    @Test
    @DisplayName("Should default price to 0.0 if a negative value is passed to constructor")
    void testNegativePriceDefaultsToZero() {
        Product p = new Product("Laptop", -500.0);
        assertEquals(0.0, p.getPrice());
    }

    @Test
    @DisplayName("Chained constructor should default price to 0.0")
    void testChainedConstructor() {
        Product p = new Product("Mouse");
        assertEquals("Mouse", p.getName());
        assertEquals(0.0, p.getPrice());
    }
}