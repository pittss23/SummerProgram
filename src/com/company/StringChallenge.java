package com.company;
//Sydney Pitts
//6/21/20

//import and label scanner
//use scanner to ask the user for an integer
//label this integer
//create an if statement that will continue the program because if the # is 0 or below the program can't continue
//generate a loop withing the if statement so that the method you are about to create will run the # of times of the int
//create a method and repeat the steps to make a scanner (with a different name because you can't use the same scanner)
//ask the user for a word
//make 2 loops (one for even and one for odd)
//make a return statement for the even and odds

import java.util.Scanner;
public class StringChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer:");//initial code and I don't need to loop it
        int i = input.nextInt();
        String a = "";//makes return a string
        if (i >= 1) {
            for (int line = 1; line <= i; line++) {//makes phrase run the amount of times given
            a = Phrase();
            System.out.println(a);
        }
    }
}

    public static String Phrase() {
        int lS;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your word:");//
        String name = keyboard.nextLine();
        String out = "";
        lS = name.length();
        for (int even = 0; even < lS; even += 2) {
            if (even % 2 == 0) {
                out += name.charAt(even);
            }
        }
        out = out + " ";//makes return a string
        for (int odd = 1; odd < lS; odd += 2) {
            if (odd % 2 == 1) {
                out += name.charAt(odd);
            }
        }
        return out;
    }
}
