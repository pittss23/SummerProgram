package com.company;

import java.util.Scanner;
public class StringChallenge {

    private static String ScanPrint;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer:");
        int i = input.nextInt();
        input.close();
        if (i >= 1) {
            for (int line = 1; line <= i; line++) {
                System.out.println(ScanPrint);
            }
        }
    }

    public static void ScanPrint() {
        int lS;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your word:");
        String name = keyboard.nextLine();
        int indexOf = name.indexOf(" ");
        String S = name.substring(0, indexOf);
        lS = S.length();
        for (int line = 0; line <= lS; line += 2) {
            if (line % 2 == 0) {
                System.out.print(S.charAt(line));
            }
        }
        System.out.print(" ");
        for (int line = 1; line <= lS; line += 2) {
            if (line % 2 == 1) {
                System.out.print(S.charAt(line));
            }
        }
    }
}
