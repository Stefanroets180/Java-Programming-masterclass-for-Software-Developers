package com.company;

public class Main {
    public static void main(String[] args) {
        boolean test = TeenNumberChecker.hasTeen(16,13,19);
        System.out.println(test);

        test = TeenNumberChecker.hasTeen(12,11,21);
        System.out.println(test);

        boolean isTeen = TeenNumberChecker.isTeen(16);
        System.out.println(isTeen);

        isTeen = TeenNumberChecker.isTeen(24);
        System.out.println(isTeen);
    }
}
