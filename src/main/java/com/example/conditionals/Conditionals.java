package com.example.conditionals;

/*
Exercise Task:
Inside the main method:
Create an int variable named score and assign it the value 75.
Write an if/else statement to check if the score is greater than or equal to 50.
If it is, print exactly: Assessment Passed!
If it is not, print exactly: Assessment Failed.
Expected Output: Assessment Passed!
 */

public class Conditionals {
    public static void main(String[] args) {
        // Write your code here
        int score = 75;

        if (score >= 50) {
            System.out.println("Assessment Passed!");
        } else {
            System.out.println("Assessment Failed.");
        }
    }
}