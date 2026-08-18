package com.chiira.loopsarrays;

import java.util.Arrays;

public class Exercise6 {
    public static void main(String[] args) {
        // declare and initialize a String array which holds the values "a", "b", "c" and "d"
        String[] alphabets = {"a","b","c","d"};

        // using your answer from Q5 above, create a second array which is initialized using your original array
        String[] alphabets2 = alphabets;

        // change the value at index 0 of the new array to "z"
        alphabets2[0] = "z";

        // print both of your arrays and compare
        System.out.println("Original Array " + Arrays.toString(alphabets));
        System.out.println("Copy Array " + Arrays.toString(alphabets2));
    }
}
