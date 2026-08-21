package com.chiira.loopsarrays;

public class Exercise16 {
    /*
    Write a program that takes arguments from the program args and loops through args and prints each item in args
    Compile using: javac and run using: java
    i.e. javac Exercise5.java | java Exercise5 foo bar baz
    */
    public static void main(String[] args) {
        // loop through args here
        for(String arg: args){
            System.out.println(arg);
        }
    }
}
