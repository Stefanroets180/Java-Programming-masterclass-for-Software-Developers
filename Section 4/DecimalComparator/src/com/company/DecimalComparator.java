package com.company;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double dec1, double dec2) {
        // Convert negative decimals to positives
        if (dec1 < 0 || dec2 < 0) {
            dec1 *= -1;
            dec2 *= -1;
        }

        // Converting decimals to integers
        dec1 *= 1000;
        dec2 *= 1000;

        // Casting decimals to remove the remaining unnecessary number after the decimal
        double noDec1 = (int)dec1;
        double noDec2 = (int)dec2;

        // Converting the values in the variables back to decimal
        noDec1 /= 1000.0d;
        noDec2 /= 1000.0d;

        // Comparing the 2 variables to check for equality to 3 decimal places
//        if (noDec1 == noDec2) {
//            return true;
//        } else return false;
        // Simplified version
        return noDec1 == noDec2;
    }
}
