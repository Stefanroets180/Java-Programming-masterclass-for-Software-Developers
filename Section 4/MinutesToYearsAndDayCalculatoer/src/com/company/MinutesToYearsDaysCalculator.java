package com.company;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int days = (int) (minutes / 60) / 24;
            int remDays = days % 365;
            int years = days / 365;

            System.out.println(minutes + " min = " + years + " y and " + remDays + " d");
        }
    }
}
