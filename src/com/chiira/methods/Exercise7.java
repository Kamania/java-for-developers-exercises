package com.chiira.methods;

// Write a method which takes a sentence as an argument, counts the number of words in the array and prints "The sentence contains X words".
public class Exercise7 {
    private static String wordCount(String sentence){
        String[] senetenceArr = sentence.split(" ");

        return "The sentence contains "+ senetenceArr.length +" words";
    }

    public static void main(String[] args) {
        System.out.println(wordCount("This is very interesting"));
    }
}
