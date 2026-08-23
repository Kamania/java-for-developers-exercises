package com.chiira.conditionals;

public class Exercise4 {
    // QUESTION 4

    public static void main(String[] args) {
        // create two `int` variables. Assign them values
        int val1 = 12;
        int val2 = 16;

        // create an `if` statement which compares whether one value is greater than the other

        // print something to the console if the condition is met
        // create an `else` statement which prints to the console if the above condition is NOT met
        if (val2 > val1) {
            System.out.println("Val2: " + val2 + " is greater than Val1: " + val1);
        }else {
            System.out.println("Val2: " + val2 + " is not greater than Val1: " + val1);
        }
    }
}
