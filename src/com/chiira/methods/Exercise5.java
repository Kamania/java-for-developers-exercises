package com.chiira.methods;

// Write a method which takes a string as an argument, capitalizes the first letter and returns the capitalized string.
public class Exercise5 {
    private static String capitalize(String text){
        if (text.isEmpty() || text.isBlank() || text == null){
            return "Strings only allowed";
        }

        return Character.toUpperCase(text.charAt(0)) + text.substring(1);
    }
    public static void main(String[] args) {
        System.out.println(capitalize("kamania"));
    }
}
