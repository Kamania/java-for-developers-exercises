package com.chiira.loopsarrays;

public class Exercise5 {
    public static void main(String[] args) {
        // declare and initialize a String array which holds the values "a", "b", "c" and "d"
        String[] alphabets = {"a","b","c","d"};

        // print the array to the console
        for (int i = 0; i < alphabets.length; i++) {
            System.out.println("Values at index " + i + " is " + alphabets[i]);
        }
    }
}
