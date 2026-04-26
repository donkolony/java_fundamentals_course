package com.example.oop;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    @Test
    @DisplayName("Full constructor should set all fields correctly")
    void testFullConstructor() {
        Student s = new Student("Alice", 101, 3.8);
        assertEquals("Alice", s.getName());
        assertEquals(101, s.getStudentId());
        assertEquals(3.8, s.getGpa());
    }

    @Test
    @DisplayName("Partial constructor should use default GPA")
    void testPartialConstructor() {
        Student s = new Student("Bob", 102);
        assertEquals("Bob", s.getName());
        assertEquals(102, s.getStudentId());
        assertEquals(0.0, s.getGpa());
    }

    @Test
    @DisplayName("No-args constructor should use all default values")
    void testNoArgsConstructor() {
        Student s = new Student();
        assertEquals("Unknown", s.getName());
        assertEquals(0, s.getStudentId());
        assertEquals(0.0, s.getGpa());
    }
}