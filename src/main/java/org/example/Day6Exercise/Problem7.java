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
        calcDays(inArray);
        this.scanner.close();
    }

    private void calcDays(int[] arrayInt) {
        try {
            int[] days = new int[arrayInt.length];
            for (int i = 0; i < arrayInt.length; i++) {
                for (int j = i; j < arrayInt.length; j++) {
                    if (arrayInt[j] > arrayInt[i]) {
                        days[i]=j-i;
                        break;
                    }
                }
            }
            System.out.println("Output : " + Arrays.toString(days));
        } catch (Exception e) {
            System.out.println("Error : " + e);
            calcDays(arrayInt);
        }
    }
}
