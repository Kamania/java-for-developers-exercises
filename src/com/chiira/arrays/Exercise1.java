package com.chiira.arrays;

public class Exercise1 {
    /*
    Write a method that reverses any String and print to console
    Input should be a string
    Output should be reversed input
*/
    public static void main(String[]args){
        // invoke your function here
        System.out.println(reverseString("Joseph is great"));
    }

    private static String reverseString(String text){
        String reversedString = "";
        for (int i = text.length() - 1; i >= 0 ; i--) {
            reversedString += text.charAt(i);
        }
        return reversedString;
    }
}
