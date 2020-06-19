package com.company;
//Sydney Pitts
//6/18/20

//use random function to generate a number 1-137 (name this variable n)
//create method for odd
    //create a for loop within the method to generate all the odd numbers within 1-137
    //use if, then parenthesis search to see if int n is in the for loop
    //else type weird
//create method for even
    //create a for loop within the method to generate all the even numbers within 1-137
    //use if, then parenthesis search to see if int n is in the for loop
    //else if create range 2-5 type not weird
    //else if create range 6-20 type weird
    //else n>= 20 type Not weird
import java.util.*;
public class ChallengeConditional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to play? (yes or no)");
        String enter = input.next();
        do {
            int min = 1;
            int max = 137;

            int n = (int) (Math.random() * (max - min + 1) + min);
            System.out.println("Your number is:" + n);

            if (n % 2 == 1) {
                System.out.println("Weird");
            } else if ((n % 2 == 0) && (n <= 5)) {
                System.out.println("Not weird");
            } else if ((n % 2 == 0) && (n >= 6 || n <= 20)) {
                System.out.println("Weird");
            } else if ((n % 2 == 0) && (n > 20)) {
                System.out.println("Not weird");
            }
            System.out.println("Do you wish to continue?");
            enter=input.next();
        }
        while (enter.contains("e"));
    }
}