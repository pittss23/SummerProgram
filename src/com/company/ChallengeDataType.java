package com.company;
import java.util.Scanner;
//Sydney Pitts
//06/16/20

//                                  Pseudo Code
//import scanner
//define and int, double and string
//define and label scanner
//print "ask for a number, a number with a decimal and a phrase
//label first number as  int i
//label second number as double d
//label phrase as string s
//seperate things with indexOf and " " then use substring 0, indexOf
//addExact first defined int and int i
//for now use + with doubles because hypot is the closest to addExact I can find for doubles
//label string ="first string".concat("string s")
//use printf with enough digits for the variables and .1 for the second variable (the double)
//use println for the labeled concat string
//some modifications were made from the pseudo code as i went along
public class ChallengeDataType {
    public static void main(String[] args) {
       //defined variables
        int i1=4;
        double d1=4.0;
        String s1="Greenhill";

        //scanner input
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number up to 10 digits");//I can change the amount of digits when i change the printf
        int i2=input.nextInt();
        System.out.print("Please enter a number up to 10 digits with a decimal");
        double d2=input.nextDouble();
        System.out.print("Please enter a phrase");
        input.nextLine();
        String phrase = input.nextLine();

        //adding
        int i=i1+i2;
        double d=d1+d2;
        String s=s1+phrase;

        //printing
        System.out.printf("\n %10d \n %10.1f \n", i, d);
        System.out.println(s);

    }
}