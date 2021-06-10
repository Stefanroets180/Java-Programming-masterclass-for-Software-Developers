package com.company;

public class TeenNumberChecker {
    public static boolean hasTeen(int n1, int n2, int n3) {

        if (n1 >= 13 && n1 <= 19) {
            return true;
        } else if (n2 >= 13 && n2 <= 19) {
            return true;
        } else return n3 >= 13 && n3 <= 19;
    }

    public static boolean isTeen(int n1) {
        return (n1 >= 13 && n1 <= 19);
    }
}
