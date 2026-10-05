package com.chiira.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise1 {
    // Print todays Date and Time using LocalDate and LocalDateTime
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        LocalDateTime currentDateTime = LocalDateTime.now();


        // formatters
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Local date: " + currentDate.format(dateFormatter));
        System.out.println("Local date and time: " + currentDateTime.format(dateTimeFormatter));
    }
}
