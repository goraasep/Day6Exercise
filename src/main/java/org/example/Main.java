package org.example;

import org.example.Day6Exercise.Exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("======= EXERCISE DAY 6 =======");
        System.out.println("1. Array Rotation.");
        System.out.println("2. Check if Array Contain Duplicates.");
        System.out.println("3. Remove Duplicates.");
        System.out.println("4. Remove All Occurrences of an Element in an Array.");
        System.out.println("5. Reverse string.");
        System.out.println("6. Find all Duplicates on Array.");
        System.out.println("7. Get n-th day to get a warmer temperature.");
        Scanner scanIn = new Scanner(System.in);
        Exercise.run(getNumExercise(scanIn));
        scanIn.close();
    }

    static int getNumExercise(Scanner scanner) {
        System.out.print("Choose Exercise: ");
        scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Input is not integer type.");
            return getNumExercise(scanner);
        }
    }
}