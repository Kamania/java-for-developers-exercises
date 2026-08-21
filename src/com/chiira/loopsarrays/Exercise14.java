package com.chiira.loopsarrays;

import java.util.Arrays;

public class Exercise14 {
    public static void main(String[] args) {
    /*
        Write a program that reverses an array of Strings
        String[] content = {"you", "are", "how", "hello"}
        Tip. Use for loop and you to start at highest index.
        Output should be: hello how are you?. Note question mark at the end
    */
        String[] content = {"you", "are", "how", "hello"};

        for (int i = content.length - 1; i >= 0 ; i--) {
            System.out.print(content[i]);

            if (i > 0){
                System.out.print(" ");
            }
        }

        System.out.print("?");

    }
}
