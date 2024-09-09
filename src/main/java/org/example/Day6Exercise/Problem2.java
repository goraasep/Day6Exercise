package org.example.Day6Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem2 {
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.println("2. Check if Array Contain Duplicates.");
        int[] inArray = Utils.getArray(scanner);
        findDuplicate(inArray);
        this.scanner.close();
    }

    private void findDuplicate(int[] arrayInt) {
        try {
            boolean isDuplicate = false;
            for (int i = 0; i < arrayInt.length; i++) {
                for (int j = 0; j < arrayInt.length; j++) {
                    if (arrayInt[i] == arrayInt[j] && i != j) {
                        isDuplicate = true;
                        break;
                    }
                }
            }
            System.out.println("Output : " + isDuplicate);
        } catch (Exception e) {
            System.out.println("Error : " + e);
            findDuplicate(arrayInt);
        }
    }
}
