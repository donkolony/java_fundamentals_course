/*
Exercise Task:
Inside the Player class, create two private fields: a String named username and an int named health.
Create a constructor that accepts only the username as a parameter and sets the health to a default of 100.
Create a public getter for the username called getUsername(). (Do not create a setter for the username; it should not be changeable after creation) .
Create a public getter for health called getHealth().
Create a public setter for health called setHealth(int newHealth).
Validation Rule: The health cannot drop below 0 and cannot exceed 100. If newHealth is greater than 100, set the health to 100. If it is less than 0, set it to 0. Otherwise, set it to the newHealth.
 */

package com.example.oop;

public class Player {
    // Write your fields, constructor, and methods here
    private String userName;
    private int health;

    public Player(String userName) {
        this.userName = userName;
        this.health = 100;
    }

    public String getUsername(){
        return userName;
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int newHealth){
        if (newHealth < 0){
            this.health = 0;
        } else if (newHealth > 100) {
            this.health = 100;
        } else {
            this.health = newHealth;
        }
    }
}