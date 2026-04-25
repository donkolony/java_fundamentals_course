/*
Exercise Task:
Outside the main method (but still inside the BasicMethods class), create a new method named multiply.
It must take two int parameters (e.g., a and b).
It must have a return type of int.
Inside the method, return the result of multiplying the two numbers together.
Inside your main method, call your multiply method, passing it the numbers 5 and 4. Store the result in a variable and print it to the console.
Expected Output:
20
 */

package com.example.methods;

public class BasicMethods {
    public static void main(String[] args) {
        // 2. Call your method here and print the result
        int result = multiply(5, 4);
        System.out.println(result);

    }

    // 1. Create your multiply method here
    public static int multiply(int a, int b){
        return a * b;
    }
}