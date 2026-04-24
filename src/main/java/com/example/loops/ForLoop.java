/*
Exercise Task:
Inside the main method, write a for loop that prints the even numbers from 2 up to 10 (inclusive). Each number must be printed on a new line.
Hint: There are two valid ways to solve this. You can either use an if statement inside the loop, or you can change how your Update step works (e.g., instead of i++ to add 1, you can use i += 2 to add 2).
Expected Output:
2
4
6
8
10
 */

package com.example.loops;

public class ForLoop {
    public static void main(String[] args) {
        // Write your code here

        for (int i = 2; i <=10; i+=2) {
                System.out.println(i);
        }
    }
}