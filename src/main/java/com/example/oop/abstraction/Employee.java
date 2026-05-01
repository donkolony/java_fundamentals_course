/*
Exercise Task:
1. In the Employee class, add a public abstract double calculateSalary(); method.
2. Create a subclass FullTimeEmployee:
    - It should have a private double monthlySalary.
    - The constructor should take name and monthlySalary.
    - Implement calculateSalary() to simply return the monthlySalary.
3. Create a subclass Contractor:
    - It should have private double hourlyRate and private int hoursWorked.
    - The constructor should take name, hourlyRate, and hoursWorked.
    - Implement calculateSalary() to return hourlyRate * hoursWorked.
4. n a Main class, demonstrate polymorphism:
    - Create an Employee reference pointing to a FullTimeEmployee.
    - Create an Employee reference pointing to a Contractor.
    - Print their names and calculated salaries.
 */

package com.example.oop.abstraction;

public abstract class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // TODO: Create an abstract method called calculateSalary() that returns a double
    public abstract double calculateSalary();
}