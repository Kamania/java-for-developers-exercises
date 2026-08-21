package com.chiira.loopsarrays;

public class Exercise15 {
    public static void main(String[] args) {
    /*
        Write a program that adds total amount for this string "0.90, 1.00, 9.00, 8.78, 0.01".

        Tip:
        - String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        - create variable to store result. double result = 0;
        - convert string to array by using the String[] numbers = input.split(", ")
        - then loop.
        - convert each string to decimal and add to current result
            - use Double.parseDouble(string) to convert a string to double
    */

        String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        double result = 0;
        String[] numbers = input.split(", ");

        for (int i = 0; i < numbers.length; i++) {
            result += Double.parseDouble(numbers[i]);
        }

        System.out.println(result);
    }
}
