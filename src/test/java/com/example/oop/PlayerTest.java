package com.example.oop;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerTest {

    @Test
    @DisplayName("Constructor should set username and default health to 100")
    void testConstructorAndGetters() {
        Player p = new Player("Hero99");
        assertEquals("Hero99", p.getUsername());
        assertEquals(100, p.getHealth());
    }

    @Test
    @DisplayName("setHealth should update health for valid inputs")
    void testSetHealthValid() {
        Player p = new Player("Hero99");
        p.setHealth(85);
        assertEquals(85, p.getHealth());
    }

    @Test
    @DisplayName("setHealth should cap health at 100 if input is too high")
    void testSetHealthAboveMax() {
        Player p = new Player("Hero99");
        p.setHealth(150);
        assertEquals(100, p.getHealth());
    }

    @Test
    @DisplayName("setHealth should floor health at 0 if input is negative")
    void testSetHealthBelowMin() {
        Player p = new Player("Hero99");
        p.setHealth(-20);
        assertEquals(0, p.getHealth());
    }
}