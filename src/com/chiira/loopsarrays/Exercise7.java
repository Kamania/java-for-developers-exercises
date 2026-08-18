package com.chiira.loopsarrays;

import java.util.Arrays;

public class Exercise7 {
    public static void main(String[] args) {
        // declare and initialize a String array which holds the values "a", "b", "c" and "d"
        String[] alphabets = {"a","b","c","d"};

        // using your answer from Q5 above, create a second array which is initialized using your original array
        String[] alphabets2 = alphabets;

        // change the value at index 0 of the new array to "z"
        alphabets2[0] = "z";

        // using your answer to Q6, create another array which is A COPY off of your original array (using the `Arrays.copyOf()` method)
        String[] alphabets3 = Arrays.copyOf(alphabets, alphabets.length);

        // change the value at index 0 of the new array to "z"
        alphabets3[0] = "z";

        // print both of your arrays and compare
        System.out.println("Original Array " + Arrays.toString(alphabets));
        System.out.println("Alphabets2 Copy Array " + Arrays.toString(alphabets2));
        System.out.println("Alphabets3 Copy Array " + Arrays.toString(alphabets3));
    }
}
