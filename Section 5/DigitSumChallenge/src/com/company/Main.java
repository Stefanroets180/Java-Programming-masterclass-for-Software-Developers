package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of digits in 3452 is: " + sumDigits(3452));
        System.out.println("The sum of digits in 125 is: " + sumDigits(125));
        System.out.println("The sum of digits in 45768 is: " + sumDigits(45768));
    }

    public static int sumDigits(int num) {
        int sum = 0;

        if(num < 10) {
            return -1;
        }

        while (num > 0) {
            // extract least-significant digit
            int digit = num%10;
            sum += digit;
            // drop least-significant digit
            num /= 10;
        }
        return sum;
    }
}
