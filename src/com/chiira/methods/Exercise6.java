package com.chiira.methods;

// Write a method which takes an array of strings as an argument and returns the number of items in the array
public class Exercise6 {
    private static int arrayLength(String[] names){
        return names.length;
    }
    public static void main(String[] args) {
        String[] names = {"jo", "df", "sdsd", "ere"};
        System.out.println(arrayLength(names));
    }
}
