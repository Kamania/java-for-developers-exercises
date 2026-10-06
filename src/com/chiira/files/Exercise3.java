package com.chiira.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise3 {
    public static void main(String[] args) {
        try {
            String filePath = "src/data.csv";

            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e){
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
