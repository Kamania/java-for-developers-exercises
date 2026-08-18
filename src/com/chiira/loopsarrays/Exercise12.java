package com.chiira.loopsarrays;

import java.util.Arrays;

public class Exercise12 {

    public static void main(String[] args) {
        String[] statements = {"i", "sure", "do", "love", "bees"};

        // create a for loop which goes through each string in our array
        for (int i = 0; i < statements.length; i++) {
            // make each word uppercase
            // assign the value in the array to the uppercase string
            statements[i] = statements[i].toUpperCase();
        }

        // print our resulting array
        System.out.println(Arrays.toString(statements));


    }
}
