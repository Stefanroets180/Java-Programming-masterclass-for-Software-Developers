package com.company;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int result = 3;
        System.out.println("1 + 2 = " + result);
        System.out.println("previousResult =  " + result);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult =  " + result);
        result *= 10;
        System.out.println("2 * 10 = " + result);
        result /= 5;
        System.out.println("20 / 5 = " + result);
        result %= 3;
        System.out.println("4 % 3 = " + result);
        ++result;
        System.out.println("1 + 1 = " + result);
        --result;
        System.out.println("2 - 1 = " + result);
        result += 2;
        System.out.println("1 + 2 = " + result);
        result *= 10;
        System.out.println("3 * 10 = " + result);
        result /= 3;
        System.out.println("30 / 3 = " + result);
        result -= 2;
        System.out.println("10 - 2 = " + result);
        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

        if (topScore > 90 || secondTopScore <= 90) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        double myFirstValue = 20.0D;
        double mySecondValue = 80.0D;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.0D;
        System.out.println("MyValuesTotal = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.0D;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = theRemainder == 0.0D;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }

    }
}
