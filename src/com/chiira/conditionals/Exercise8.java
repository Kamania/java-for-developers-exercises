package com.chiira.conditionals;

public class Exercise8 {

    public static void main(String[] args) {
        // create a String variable and assign it a value
        String text = "Happy holidays";

        // create a `for` loop which wraps around your answer from Question 7
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == 'a') {
                continue;
            }

            System.out.print(c);
        }

        // System.out.println(text);
        // modify your `if` statement to check the character at each index
        // Hint: use your internal, incrementing value of your `for` loop within the `.charAt()` method
        // print something to the console if the condition is met
    }
}
