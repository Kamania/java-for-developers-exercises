package com.chiira.scanners;

import java.util.Scanner;

public class Exercise3 {
    /*
    Write a program that takes an input number from the console and prints if number is prime
    Create a method to check if number is prime then use against the input
*/
    public static boolean isPrimeNumber(int n){
        // 1 or less are not prime
        if (n <=  1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer:");
        
        int myValue = scanner.nextInt();

        boolean isPrime = isPrimeNumber(myValue);

        if (isPrime){
            System.out.println(myValue + " is a prime number");
        }else {
            System.out.println(myValue + " is not a prime number");
        }

        scanner.close();

    }
}
