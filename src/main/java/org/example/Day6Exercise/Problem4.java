package org.example.Day6Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem4 {
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.println("4. Remove All Occurrences of an Element in an Array.");
        int[] inArray = Utils.getArray(scanner);
        int key = getKey();
        removeOccurrences(inArray,key);
        this.scanner.close();
    }

    private int getKey() {
        try {
            System.out.print("Key : ");
            return this.scanner.nextInt();
        } catch (Exception e) {
            this.scanner = new Scanner(System.in);
            System.out.println("Input is not integer.");
            return getKey();
        }
    }

    private void removeOccurrences(int[] arrayInt,int key) {
        try {
            List<Integer> newArr = new ArrayList<>();
            for (int j : arrayInt) {
                if (j!=key) {
                    newArr.add(j);
                }
            }
            System.out.println("Output : " + newArr.toString());
        } catch (Exception e) {
            System.out.println("Error: " + e);
            removeOccurrences(arrayInt,key);
        }
    }
}
