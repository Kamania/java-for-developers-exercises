package com.chiira.methods;

//Write a method which takes two numbers as arguments and prints one of:
//
//        "The first number is larger"
//        "The second number is larger"
//        "The numbers are equal"
public class Exercise4 {
    private static String numberComparison(int val1, int val2){
        String message = "";

        if (val1 > val2) {
            message += "The first number is larger";
        }else if (val2 > val1) {
            message += "The second number is larger";
        }else {
            message += "The numbers are equal";
        }

        return message;
    }

    public static void main(String[] args) {
        System.out.println(numberComparison(13, 13));
    }
}
