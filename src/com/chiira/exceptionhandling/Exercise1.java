package com.chiira.exceptionhandling;

public class Exercise1 {
//    write a program that converts program arguments to an integer
//if value cannot be converted to int store them somewhere
//    calculate sum for numbers that can be converted to an integer
//finally print the numbers that cannot be converted to an int
//    example: java com.amigoscode.exercises.week_two_wed.exercises.Exercise6 1 2 a b foo 3
//    output: Sum: 6 and a, b, foo are not numbers

    public static void main(String[] args) {
        int sum = 0;
        StringBuilder noIntValues = new StringBuilder();

        for (String arg: args){
            try {
                int num = Integer.parseInt(arg);
                sum += num;
            } catch (NumberFormatException e){
                if (noIntValues.length() > 0){
                    noIntValues.append(", ");
                }
                noIntValues.append(arg);
            }
        }

        System.out.println("Sum: " + sum);

        if (noIntValues.length() > 0){
            System.out.println(" and " + noIntValues + " are not numbers.");
        }
    }
}
