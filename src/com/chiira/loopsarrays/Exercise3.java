package com.chiira.loopsarrays;

public class Exercise3 {
    public static void main(String[] args) {
        // declare an empty integer array of length = 3
        int numbers[] = new int[3];

        // fill it with the number `4`
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 4;
        }

        // reassign the second value in the array to the number `17`
        numbers[1] = 17;

        // print the array to the console
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Value at index " + i + " is " + numbers[i]);
        }


    }
}
