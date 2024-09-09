package org.example.Day6Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem1 {
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.println("1. Array Rotation.");
        int[] inArray = Utils.getArray(scanner);
        int target = getTarget();
        getResult(inArray, target);
        this.scanner.close();
    }

    private int getTarget() {
        try {
            System.out.print("D : ");
            return this.scanner.nextInt();
        } catch (Exception e) {
            this.scanner = new Scanner(System.in);
            System.out.println("Input is not integer.");
            return getTarget();
        }
    }

    private void getResult(int[] arrayInt, int target) {
        try {
            List<Integer> newArr = new ArrayList<>();
            for (int i = target; i < arrayInt.length; i++) {
                newArr.add(arrayInt[i]);
            }
            for (int i = 0; i < target; i++) {
                newArr.add(arrayInt[i]);
            }
            System.out.print("Output : " + newArr.toString());
//            Arrays.copyOfRange(ligature, 0, 5);
        } catch (Exception e) {
            System.out.println("Error : " + e);
            getResult(arrayInt, target);
        }
    }
//    private void getResult(int[] arrayInt, int target) {
//        try {
//            List<Integer> newArr = new ArrayList<>();
//            for (int i = target; i < arrayInt.length; i++) {
//                newArr.add(arrayInt[i]);
//            }
//            for (int i = 0; i < target; i++) {
//                newArr.add(arrayInt[i]);
//            }
//            System.out.println(newArr.toString());
////            Arrays.copyOfRange(ligature, 0, 5);
//        } catch (Exception e) {
//            System.out.println("Error: " + e);
//            getResult(arrayInt, target);
//        }
//    }
}
