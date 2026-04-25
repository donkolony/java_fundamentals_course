/*
Exercise Task:
Inside the ProfileManager class, write three overloaded methods named createProfile. All of them must return a String.
Method 1: Takes one parameter (String username).
Returns: "User: [username], Status: Active"
Method 2: Takes two parameters (String username, int age).
Returns: "User: [username], Age: [age], Status: Active"
Method 3: Takes two parameters (String username, String customStatus).
Returns: "User: [username], Status: [customStatus]"
Inside your main method, call all three methods, pass them appropriate data (e.g., "Alice", "Bob", 25, "Charlie", "Away"), and print their returned strings to the console.
Expected Output (Example based on inputs above):
User: Alice, Status: Active
User: Bob, Age: 25, Status: Active
User: Charlie, Status: Away
 */

package com.example.methods;

public class ProfileManager {
    public static void main(String[] args) {
        // 4. Call all three overloaded methods here and print their results
        String alice = "Alice";
        String bob = "Bob";
        String charlie = "Charlie";
        int age = 25;
        String customStatus = "Away";

        System.out.println(createProfile(alice));
        System.out.println(createProfile(bob, age));
        System.out.println(createProfile(charlie, customStatus));

    }

    // 1. Create createProfile(String username) here
    public static String createProfile(String username) {
        return "User: " + username + ", Status: Active";
    }

    // 2. Create createProfile(String username, int age) here
    public static String createProfile(String username, int age){
        return "User: " + username + ", Age: " + age + ", Status: Active";
    }

    // 3. Create createProfile(String username, String customStatus) here
    public static String createProfile(String username, String customStatus){
        return "User: " + username + ", Status: " + customStatus;
    }

}