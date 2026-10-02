package com.chiira.scanners;

import java.util.Scanner;

public class Exercise2 {
    /*
    Write a program that receives numbers as program arguments and prints to console if numbers are even or odd
    You might compile and run the program via command line or by editing configuration and pass program arguments
*/
    public static void main(String[] args) {
        // args should contain numbers
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");

        int myValue = scanner.nextInt();

        if (myValue % 2 == 0) {
            System.out.println("The value entered is even");
        }else {
            System.out.println("The value entered is odd");
        }
    }

}
