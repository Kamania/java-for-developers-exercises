package com.chiira.loopsarrays;

import java.util.Arrays;

public class Exercise10 {
    public static void main(String[] args) {
        // create an array. Remember to manually set the size
        int[] ages = new int[11];

        // create a for loop which goes from 0 to 10, adding each value to an array
        for (int i = 0; i < ages.length; i++) {
            ages[i] = i;
        }

        // print our array
        System.out.println(Arrays.toString(ages));
    }
}
