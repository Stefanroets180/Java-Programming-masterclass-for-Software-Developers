package com.company;

public class Main {
    public static void main(String[] args) {
        boolean wakeUp = BarkingDog.shouldWakeUp(true, 4);
        System.out.println(wakeUp);
        boolean wakeUp1 = BarkingDog.shouldWakeUp(true, 9);
        System.out.println(wakeUp1);
        boolean wakeUp2 = BarkingDog.shouldWakeUp(true, 25);
        System.out.println(wakeUp2);
        boolean wakeUp3 = BarkingDog.shouldWakeUp(true, -2);
        System.out.println(wakeUp3);
        boolean wakeUp4 = BarkingDog.shouldWakeUp(false, -2);
        System.out.println(wakeUp4);
    }
}
