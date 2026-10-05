package com.chiira.dates;

import java.time.LocalDate;
import java.time.Period;

public class Exercise4 {
    public static void main(String[] args) {
        int dobYear = 1995;
        int dobMonth = 4;
        int dobDay = 26;

        LocalDate dob = LocalDate.of(dobYear, dobMonth, dobDay);
        LocalDate currentDate = LocalDate.now();
        int age = calculateAge(dob, currentDate);

        System.out.println("Age: " + age);

    }

    private static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        // Calculate the period between the birth date and current date
        Period period = Period.between(birthDate, currentDate);

        // Get the years from the period
        int years = period.getYears();

        // Get the months from the period
        int months = period.getMonths();

        // Get the days from the period
        int days = period.getDays();

        // Adjust the age based on the months and days
        if (months < 0 || (months == 0 && days < 0)){
            years--;
        }

        return years;
    }
}
