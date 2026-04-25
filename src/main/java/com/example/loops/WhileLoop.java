/*
Exercise Task:
Inside the main method:
Create an int variable named countdown and set it to 5.
Write a while loop that prints the value of countdown as long as it is greater than 0.
Inside the loop, do not forget to decrease countdown by 1 each time.
After the loop finishes, print exactly: Liftoff!
Expected Output:
5
4
3
2
1
Liftoff!
 */

package com.example.loops;

public class WhileLoop {
    public static void main(String[] args) {
        // Write your code here

        int countdown = 5;

        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("Liftoff!");
    }
}