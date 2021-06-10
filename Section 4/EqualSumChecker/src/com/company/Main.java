package com.company;

public class Main {
    public static void main(String[] args) {
        boolean test = EqualSumChecker.hasEqualSum(1,1,2);
        System.out.println(test);

        test = EqualSumChecker.hasEqualSum(13,1,12);
        System.out.println(test);
    }
}
