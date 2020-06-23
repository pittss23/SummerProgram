package com.company;
//Sydney Pitts
//6/22/20

//import and label scanner
//use scanner to ask the user for an integer
//label this integer
//create an if statement that will continue the program because if the # is 0 or below the program can't continue
//generate a loop withing the if statement so that the method you are about to create will run the # of times of the int
//create a method and repeat the steps to make a scanner (with a different name because you can't use the same scanner)
//ask the user for a word
//make 2 loops (one for even and one for odd)
//make a return statement for the even and odds

//^pseudo code from before
//define the words into characters with array
// make a conditional for space, even and odds
//add the even characters together and the odd characters together with a space inbetween

import java.util.Scanner;
import java.util.Arrays;

public class updatedStringChallenge {
    private static Object String;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer:");
        int i = input.nextInt();
        String a = "";//makes it a string
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your words:");//takes in words all together
        String in = keyboard.nextLine();
        char [] name = in.toCharArray();//makes words into characters
        String even = "";
        String odd = "";
        int count = 0;//when it counts it must start at 0
        int lS = name.length;
        for (int j = 0; j < lS; j += 1) {//j must be less than the length of the word
            if (name[j] == ' ') {//j is made into a space to seperate the words apart
                System.out.println(even + " " +odd);
                even = "";
                odd = "";
                count = -1;
            }
            else if (count % 2 == 0) {//seperates evens from odds
                even += name[j];//adds characters together
            }
            else {
                odd += name[j];
            }
            count++;
        }
        System.out.print(even + " " +odd);
    }
}

