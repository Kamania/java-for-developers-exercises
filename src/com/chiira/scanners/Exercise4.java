package com.chiira.scanners;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Exercise4 {
    /*
    Write a method that displays random joke to the user.
    Your program should stop displaying jokes when use inputs no.
    For e.g
    Want to hear a joke? Yes/No
        if yes then display joke and repeat same question
        if no then program should exit
*/
    public static void main(String[] args) {
        String[] jokes = {
                "Joke 1",
                "Joke 2",
                "Joke 3",
                "Joke 4",
                "Joke 5",
                "Joke 6",
                "Joke 7",
                "Joke 8",
                "Joke 9",
        };

        // use the code below to generate random numbers. In this case from 0 to 9
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // You need to change random.nextInt(9); accordingly to match your jokes array length


        while (true){
            System.out.println("Want to hear a joke? Yes/No");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("no")) {
                System.out.println("Alright, goodbye!");
                break;
            } else if (input.equals("yes")) {
                int randomNumber = random.nextInt(jokes.length);
                System.out.println(jokes[randomNumber]);
            }else {
                System.out.println("Invalid input. Please enter 'Yes' or 'No'");
            }
        }
    }
}
