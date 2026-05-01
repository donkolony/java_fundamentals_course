package com.example.oop.abstraction;

public class Main {

    public static void main(String[] args){
        Employee fullTimeEmployee = new FullTimeEmployee("Don", 30000.0);
        Employee contractor = new Contractor("Tshepo", 625.0, 40);

        System.out.println("Name: " + fullTimeEmployee.getName() + " Salary: " + fullTimeEmployee.calculateSalary());
        System.out.println("Name " + contractor.getName() + " Salary: " + contractor.calculateSalary());
    }
}
