package com.chiira.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercise2 {
    // Represent your date of birth using LocalDate
    public static void main(String[] args) {
        LocalDate dob = LocalDate.of(1995, 04, 26);

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        System.out.println(dob.format(dateFormatter));
    }

}
