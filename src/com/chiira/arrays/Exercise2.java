package com.chiira.arrays;

public class Exercise2 {
    /*
    Given the following String input
    String input = "   amig os cod e  "
    Write a method that transforms input into: Amigoscode
*/
    public static void main(String[]args){
        String input = "   amig os cod e  ";

        System.out.println(stringTransform(input));
    }

    public static String stringTransform(String input){
        if (input == null || input.isEmpty()){
            return input;
        }

        String transformedText = "";

        for (int i = 0; i < input.length() ; i++) {
            if (input.charAt(i) == ' '){
                continue;
            }

            transformedText += input.charAt(i);
        }

        transformedText = transformedText.trim();

        return Character.toUpperCase(transformedText.charAt(0)) + transformedText.substring(1);
    }

}
