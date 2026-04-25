package com.example.methods;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ProfileManagerTest {

    @Test
    @DisplayName("Should create basic profile with one String parameter")
    void testCreateProfileBasic() {
        assertEquals("User: Alice, Status: Active", ProfileManager.createProfile("Alice"));
    }

    @Test
    @DisplayName("Should create profile with String and int parameters")
    void testCreateProfileWithAge() {
        assertEquals("User: Bob, Age: 25, Status: Active", ProfileManager.createProfile("Bob", 25));
    }

    @Test
    @DisplayName("Should create profile with two String parameters")
    void testCreateProfileWithCustomStatus() {
        assertEquals("User: Charlie, Status: Away", ProfileManager.createProfile("Charlie", "Away"));
    }
}