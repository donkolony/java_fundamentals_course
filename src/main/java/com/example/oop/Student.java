/*
Exercise Task:
Inside the Student class, implement three constructors using this() for chaining:
Constructor 1: Takes name, studentId, and gpa. This is your "master" constructor that sets all fields.
Constructor 2: Takes only name and studentId. It should call the master constructor using this() and provide a default gpa of 0.0.
Constructor 3: Takes no parameters (no-args). It should call the master constructor and provide default values: "Unknown" for name, 0 for ID, and 0.0 for GPA.
Implement public getters for all three fields.
 */

package com.example.oop;

public class Student {
    private String name;
    private int studentId;
    private double gpa;

    // TODO: Implement three constructors using chaining
    // Chaining constructor
    public Student(String name, int studentId){
        this(name,studentId, 0.0);
    }

    // Chaining constructor
    public Student() {
        this("Unknown", 0, 0.0);
    }

    // Master constructor
    public Student(String name, int studentId, double gpa){
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    // TODO: Implement getters for name, studentId, and gpa
    public String getName() {return name;}

    public int getStudentId() {return studentId;}

    public double getGpa() {return gpa;}

}