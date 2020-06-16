package com.company;

import java.util.Scanner;

public class AskLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your phrase:");
        String phrase = input.nextLine();
        int indexOf = phrase.indexOf(" ");
        String firstword = phrase.substring(0, indexOf);
        int count = 0;
        char firstletter;

        for (int i = 0; i < firstword.length(); i++) {
            firstletter = firstword.charAt(i);
            while (firstletter != ' ') {
                count++;
                String temp = firstword.substring(i + 1);
                int index = temp.indexOf(firstletter);
                System.out.println(temp + " " + index);
                while (index > 0) {
                    count++;
                    temp = temp.substring(index + 1);
                    index = firstword.substring(index + 1).indexOf(firstletter);
                    System.out.println(firstletter + " " + count);
                    //index needs to change
                }
            }
                count = 0;
        }
    }
}