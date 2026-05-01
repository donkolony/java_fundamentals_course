package com.example.oop.abstraction;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AbstractionTest {

    @Test
    @DisplayName("FullTimeEmployee should calculate salary correctly")
    void testFullTimeSalary() {
        Employee emp = new FullTimeEmployee("Alice", 5000.0);
        assertEquals(5000.0, emp.calculateSalary());
    }

    @Test
    @DisplayName("Contractor should calculate salary based on hours")
    void testContractorSalary() {
        Employee emp = new Contractor("Bob", 50.0, 160);
        assertEquals(8000.0, emp.calculateSalary());
    }
}