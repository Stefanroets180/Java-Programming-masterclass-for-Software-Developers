package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, 2021));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2021));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1, 2021));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, -2021));
    }
}
