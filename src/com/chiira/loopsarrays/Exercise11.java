package com.chiira.loopsarrays;

public class Exercise11 {
    public static void main(String[] args) {
        // create an array of n numbers
        int[] numbers = {10,20,30,40};

        // create a sum variable
        int sumOfNumbersArray = 0;

        // create a loop
        for (int i = 0; i < numbers.length; i++) {
            // add each item to the sum value
            sumOfNumbersArray += numbers[i];
        }

        // outside the loop print the total sum
        System.out.println(sumOfNumbersArray);
    }
}
