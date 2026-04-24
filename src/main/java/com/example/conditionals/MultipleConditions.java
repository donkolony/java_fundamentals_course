package com.example.conditionals;

/*
Exercise Task:
Inside the main method:
Create an int variable named age and assign it the value 20.
Create a boolean variable named hasTicket and assign it the value false.
Write an if / else if / else structure:
If the age is greater than or equal to 18 AND they have a ticket (hasTicket == true), print exactly: Welcome to the movie!
Else if the age is greater than or equal to 18 AND they DO NOT have a ticket (hasTicket == false), print exactly: Please buy a ticket.
Else (for anyone under 18, regardless of ticket status), print exactly: You are not old enough for this movie.
Hint: Because we are testing with age = 20 and hasTicket = false, your program should end up printing the second scenario.
Expected Output: Please buy a ticket.
 */

public class MultipleConditions {
    public static void main(String[] args) {
        // Write your code here

        int age = 20;
        boolean hasTicket = false;

        if (age >= 18 && hasTicket) {
            System.out.println("Welcome to the movie!");
        } else if(age >= 18 && !hasTicket) {
            System.out.println("Please buy a ticket.");
        } else {
            System.out.println("You are not old enough for this movie.");
        }
    }
}