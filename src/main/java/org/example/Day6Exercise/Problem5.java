package org.example.Day6Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem5 {
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.println("5. Reverse string.");
        reverseString();
        this.scanner.close();
    }

    private void reverseString() {
        try {
            System.out.print("Input : ");
            String input=this.scanner.nextLine();
            StringBuilder newWord= new StringBuilder();
            for (int i = input.length() - 1; i >= 0; i--) {
                newWord.append(input.charAt(i));
            }
            System.out.println("Output : " + newWord);
        } catch (Exception e) {
            System.out.println("Error: " + e);
            reverseString();
        }
    }
}
