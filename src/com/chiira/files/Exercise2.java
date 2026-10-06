package com.chiira.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise2 {
    // Read back out the contents of the file stored under src/data.csv
    public static void main(String[] args) {
        File file = new File("src/data.csv");

        try(Scanner reader = new Scanner(file)) {
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e){
            System.out.println("The file could not be found");
        }
    }
}
