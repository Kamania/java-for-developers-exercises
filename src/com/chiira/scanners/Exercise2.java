package com.chiira.scanners;

import java.util.Scanner;

public class Exercise2 {
    /*
    Write a program that receives numbers as program arguments and prints to console if numbers are even or odd
    You might compile and run the program via command line or by editing configuration and pass program arguments
*/
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide numbers as program arguments");
            return;
        }

        for (String arg: args){
            try {
                int number = Integer.parseInt(arg);

                if (number % 2 == 0){
                    System.out.println(number + " is even.");
                }else {
                    System.out.println(number + " is odd.");
                }
            }catch (NumberFormatException e){
                System.out.println(arg + " is not a valid integer.");
            }
        }
    }

}
