package com.chiira.conditionals;

public class Exercise3 {
    // QUESTION 3

    public static void main(String[] args) {
        // create an string variable using the `new` keyword
        String text1 = new String("hello");

        // create a second string variable which has the same value as the first, again using the `new` keyword
        String text2 = new String("hello");

        // create an `if` statement which compares the two variables and prints to the console if they are equal
        if (text1 == text2){
            System.out.println("Text 1 is equal to Text 2");
        }
    }
}
