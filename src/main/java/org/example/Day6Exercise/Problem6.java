package org.example.Day6Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem6 {
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.println("6. Find all Duplicates on Array.");
        int[] inArray = Utils.getArray(scanner);
        findDuplicate(inArray);
        this.scanner.close();
    }

    private void findDuplicate(int[] arrayInt) {
        try {
            List<Integer> newArr = new ArrayList<>();
            for (int i = 0; i < arrayInt.length; i++) {
                for (int j = 0; j < arrayInt.length; j++) {
                    if (arrayInt[i] == arrayInt[j] && i != j && !newArr.contains(arrayInt[i])) {
                        newArr.add(arrayInt[i]);
                        break;
                    }
                }
            }
            System.out.println("Output : " + newArr.toString());
        } catch (Exception e) {
            System.out.println("Error : " + e);
            findDuplicate(arrayInt);
        }
    }
}
