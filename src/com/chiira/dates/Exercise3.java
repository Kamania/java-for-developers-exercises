package com.chiira.dates;

import java.time.LocalDate;

public class Exercise3 {
    // Add 100 days to your date of birth and print it

    public static void main(String[] args) {
        int dobDay = 26;
        int dobMonth = 4;
        int dobYear = 1995;

        LocalDate dobDate = LocalDate.of(dobYear, dobMonth, dobDay).plusDays(100);

        System.out.println("DOB + 100 days: " + dobDate);

    }
}
