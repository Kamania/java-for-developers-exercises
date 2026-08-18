package com.chiira.loopsarrays;

import java.util.Arrays;

public class Exercise13 {
    public static void main(String[] args) {
        String[] statements = {"i", "sure", "do", "love", "bees"};

        // create a for loop which goes through each string in our array
        for (int i = 0; i < statements.length; i++) {
            // grab the first letter of our word
            // capitalise the first letter
            char firstLetter = Character.toUpperCase(statements[i].charAt(0));

            // add the capitalised letter to the rest of the provided word
            statements[i] = firstLetter + statements[i].substring(1, statements[i].length());
        }

        System.out.println(Arrays.toString(statements));

    }


    // assign the value to an array
    // print our resulting array
}
