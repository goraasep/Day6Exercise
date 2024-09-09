package org.example.Day6Exercise;

import java.util.Scanner;

public class Utils {
    public static int[] getArray(Scanner scanner) {
        try {
            System.out.print("Input Array: ");
            String inArrNumber = scanner.nextLine();
            String[] arrString = inArrNumber.split(",");
            int[] numbers = new int[arrString.length];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(arrString[i]);
            }
            return numbers;
        } catch (Exception e) {
            System.out.println("Input is not array of integer.");
            return getArray(scanner);
        }
    }
}
