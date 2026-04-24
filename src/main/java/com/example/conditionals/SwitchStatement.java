/*
Exercise Task:
Inside the main method:
Create an int variable named dayNumber and assign it the value 3.
Write a modern switch statement that checks the value of dayNumber.
Create cases for 1 through 5 representing the weekdays (e.g., 1 prints exactly Monday, 2 prints exactly Tuesday, 3 prints exactly Wednesday, etc.).
Include a default case that prints exactly Invalid or weekend day.
Hint: Because dayNumber is 3, the output should be Wednesday.
Expected Output: Wednesday
 */

package com.example.conditionals;

public class SwitchStatement {
    public static void main(String[] args) {
        // Write your code here

        int dayNumber = 3;

        switch (dayNumber) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            default -> System.out.println("Invalid or weekend day");
        }
    }
}