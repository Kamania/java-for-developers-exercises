package com.chiira.conditionals;

public class Exercise7 {
    public static void main(String[] args) {
        // create a String variable and assign it a value
        String text = "Amigoscode";

        // create an `if` statement which grabs the first letter of your word and compares it against a Character value
        if (text.charAt(0) == 'A') {
            System.out.println("First letter are a match");
        }else {
            System.out.println("do not match");
        }
        // print something to the console if the condition is met
    }
}
