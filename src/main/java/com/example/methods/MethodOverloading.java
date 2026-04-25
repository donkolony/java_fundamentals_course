/*
Create a method named calculateArea that takes one int parameter (side). It must return an int representing the area of a square (side * side).
Create an overloaded method also named calculateArea, but make this one take two double parameters (length and width). It must return a double representing the area of a rectangle (length * width).
Exercise Task:
Expected Output:
Inside your main method, call the first calculateArea passing the value 5. Print the result.
Next, call the second calculateArea passing the values 4.0 and 2.5. Print the result.
25
10.0
 */

package com.example.methods;

public class MethodOverloading {
    public static void main(String[] args) {
        // 3. Call both calculateArea methods here and print their results
        int areaOfSquare = calculateArea(5);
        double areaOfRectangle = calculateArea(4.0, 2.5);

        System.out.println(areaOfSquare);
        System.out.println(areaOfRectangle);
    }

    // 1. Create the calculateArea method for a square here
    public static int calculateArea(int side) {
        return side * side;
    }

    // 2. Create the overloaded calculateArea method for a rectangle here
    public static double calculateArea(double length, double width) {
        return length * width;
    }
}