package com.company;

import java.util.Scanner;
public class LetterPhrase {
    public static int indexOf;
    public static String phrase;
    public static char letter;
    public static String firstword;
    public static int count;

    public static void main(String[] args) {
        Scanner screen = new Scanner(System.in);
        System.out.println("Say something!");
        String phrase = screen.nextLine();
        int indexOf = phrase.indexOf(" ");
        firstword = phrase.substring(0, indexOf + 1);// "Peter "
        letter = ' ';
        count = 0;
        countingLettersFW(letter,count,phrase);
    }
    public static void countingLettersFW(char letter, int count, String phrase) {
        for (int index = 0; index < firstword.length(); index++) {
            letter = firstword.charAt(index);
            if (letter != ' ') {
                count++;
                String temp = phrase.substring(index + 1);
                indexOf = temp.indexOf(letter);
                while (indexOf >= 0) {
                    count++;
                    temp = temp.substring(indexOf + 1);
                    indexOf = temp.indexOf(letter);
                }
                // find the rest of the letter of your message maybe use a method??

                //  replace the letter you just finished in the firstword with a ' '
                phrase = phrase.replace(letter,' ');
                firstword = firstword.replace(letter,' ');
                System.out.println(letter + " " + count);
                count = 0;
            }
        }
    }
}
