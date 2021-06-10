package com.company;

public class Main {
    public static void main(String[] args) {
        int year = 2000;
        boolean year1 = LeapYear.isLeapYear(year);
        System.out.println("Is the year " + year + " a leap year? " + year1 );

        year = 2100;
        year1 = LeapYear.isLeapYear(year);
        System.out.println("Is the year " + year + " a leap year? " + year1 );

        year = 2400;
        year1 = LeapYear.isLeapYear(year);
        System.out.println("Is the year " + year + " a leap year? " + year1 );
    }
}
