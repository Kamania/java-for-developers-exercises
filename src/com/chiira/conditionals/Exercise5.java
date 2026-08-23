package com.chiira.conditionals;

public class Exercise5 {
    // QUESTION 5

    public static void main(String[] args) {
        // create two `int` variables. Assign them values
        int val1 = 12;
        int val2 = 16;

        // create three `int` variables. Assign them values with the first value sitting between the other two
        int val3 = 10;

        // create an `if` statement which compares whether the first value is greater than the second AND less than the third
        if (val1 > val2 && val1 < val3) {
            System.out.println("Val1 is greater than val2 and less than val3");
        }else {
            System.out.println("Val1 is less than val2 and greater than val3");
        }
        // print something to the console if the condition is met
        // create an `else` statement which prints to the console if the above condition is NOT met
    }
}
