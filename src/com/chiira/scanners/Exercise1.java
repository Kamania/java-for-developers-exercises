package com.chiira.scanners;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        // create a Scanner object - remember to import `java.util.Scanner` at the top of your file!
        Scanner myScanner = new Scanner(System.in);
        // create a variable which is assigned to the value passed into the scanner from the terminal
        String myInput = myScanner.nextLine();
        // print this variable
        System.out.println(myInput);
    }
}
