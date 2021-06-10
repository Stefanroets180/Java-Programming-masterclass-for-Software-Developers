package com.company;

public class Main {
    public static void main(String[] args) {
        boolean test1 = DecimalComparator.areEqualByThreeDecimalPlaces(3.4567, 3.457);
        System.out.println(test1);

        boolean test2 = DecimalComparator.areEqualByThreeDecimalPlaces(-3.4567, -3.45689);
        System.out.println(test2);
    }
}
