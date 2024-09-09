package org.example.Day6Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem7 {
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.println("7. Get n-th day to get a warmer temperature.");
        int[] inArray = Utils.getArray(scanner);
        int th = warmThreshold();
        calcDays(inArray, th);
        this.scanner.close();
    }

    private int warmThreshold() {
        try {
            System.out.print("Warm threshold : ");
            return this.scanner.nextInt();
        } catch (Exception e) {
            this.scanner = new Scanner(System.in);
            System.out.println("Input is not integer.");
            return warmThreshold();
        }
    }

    private void calcDays(int[] arrayInt, int th) {
        try {
            int[] days = new int[arrayInt.length];
            for (int i = 0; i < arrayInt.length; i++) {
                for (int j = i; j < arrayInt.length; j++) {
                    if (arrayInt[j] <= th) {
                        days[i]++;
                    } else {
                        break;
                    }
                }
            }
            System.out.println("Output : " + Arrays.toString(days));
        } catch (Exception e) {
            System.out.println("Error : " + e);
            calcDays(arrayInt, th);
        }
    }
}
