package org.example.Day6Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Problem3 {
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.println("3. Remove Duplicate Elements From an Array.");
        int[] inArray = Utils.getArray(scanner);
        sortArray(findDuplicate(inArray));
        this.scanner.close();
    }

    private int[] findDuplicate(int[] arrayInt) {
        try {
            List<Integer> newArr = new ArrayList<>();
            for (int j : arrayInt) {
                if (!newArr.contains(j)) {
                    newArr.add(j);
                }
            }
            return newArr.stream().mapToInt(i->i).toArray();
        } catch (Exception e) {
            System.out.println("Error : " + e);
            return findDuplicate(arrayInt);
        }
    }

    private void sortArray(int[] arrayInt){
        try {
            System.out.print("Sort (asc,desc) : ");
            String sortType= this.scanner.nextLine();
            System.out.println(sortType);
            if (sortType.toLowerCase().equals("asc")){
                for (int i = 0; i < arrayInt.length - 1; i++) {
                    boolean swapped = false;
                    for (int j = 0; j < arrayInt.length - i - 1; j++) {
                        if (arrayInt[j] > arrayInt[j + 1]) {
                            int temp = arrayInt[j];
                            arrayInt[j] = arrayInt[j + 1];
                            arrayInt[j + 1] = temp;
                            swapped = true;
                        }
                    }
                    if (!swapped)
                        break;
                }
                System.out.print("Output : "+ Arrays.toString(arrayInt));
            } else if (sortType.toLowerCase().equals("desc")) {
                for (int i = 0; i < arrayInt.length - 1; i++) {
                    boolean swapped = false;
                    for (int j = 0; j < arrayInt.length - i - 1; j++) {
                        if (arrayInt[j] < arrayInt[j + 1]) {
                            int temp = arrayInt[j];
                            arrayInt[j] = arrayInt[j + 1];
                            arrayInt[j + 1] = temp;
                            swapped = true;
                        }
                    }
                    if (!swapped)
                        break;
                }
                System.out.print("Output : "+ Arrays.toString(arrayInt));
            }else{
                System.out.println("Sorting type not found.");
                sortArray(arrayInt);
            }
        }catch (Exception e){
            System.out.println("Error : " + e);
            sortArray(arrayInt);
        }
    }
}
