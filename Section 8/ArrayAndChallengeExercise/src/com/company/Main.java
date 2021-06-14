package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(6);

        printArray(myIntegers);
        sortArray(myIntegers);
        printArray(myIntegers);
    }

    // User input
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " Integer values.\r");
        int[] values = new int[number];
        for(int i=0; i<values.length; i++) {
            System.out.print("Enter Element " + i + ": ");
            values[i] = scanner.nextInt();
        }
        System.out.println(" ");  // blank line
        return values;
    }

    // User output
    public static void printArray(int[] array) {
        System.out.println("Current Array:");
        for(int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " = " + array[i]);
        }
        System.out.println(" ");  //blank line
    }

    // Sorting the user input array and outputting
    public static void sortArray(int[] array) {
        int[] sorted = new int[array.length];
        for(int i=0; i<sorted.length; i++) {
            sorted[i] = array[i];
        }
        int temp;

        System.out.println("Array in descending order:");
        for (int i = 0; i < sorted.length; i++)
        {
            for (int j = i + 1; j < sorted.length; j++) {
                if (sorted[i] < sorted[j])
                {
                    temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }

        for(int i=0; i<sorted.length; i++) {
            System.out.println("Element " + i + " = " + sorted[i]);
        }
        System.out.println(" "); //blank line
    }
}
