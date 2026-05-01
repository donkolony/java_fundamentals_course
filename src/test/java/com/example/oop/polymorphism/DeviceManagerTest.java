package com.example.oop.polymorphism;

import com.example.oop.inheritance.Device;
import com.example.oop.inheritance.Smartphone;
import com.example.oop.inheritance.Laptop;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DeviceManagerTest {

    @Test
    @DisplayName("Device array should hold different subclasses and call their specific toString methods")
    void testPolymorphicBehavior() {
        Device[] devices = new Device[2];
        devices[0] = new Smartphone("Apple", "iPhone 15");
        devices[1] = new Laptop("Dell");

        assertTrue(devices[0].toString().contains("Apple iPhone 15"));
        assertTrue(devices[1].toString().contains("Dell Laptop"));
    }
}