package com.company;
import java.util.Scanner;
public class GangstaName {
    //Note: you can use methods from other codes by saying title.method
    //importing java> import java.lang.(name)
    //Byte, int, short, long, char, boolean, float, data (primitive data types)
    //An object is an instance of a class
    //String is an array of char

    public static void main(String[] args) {
        gangname();
    }
            public static void gangname() {
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter your name:");
            String name = input.nextLine();
            System.out.println(name);
            int indexOf = name.indexOf(" ");
            String initial = name.substring(0, 1);
            String Did = ("Diddy ");
            String lname = name.toUpperCase().substring(indexOf + 1);
            String fname = name.substring(0, indexOf);
            name.substring(0, indexOf);
            String izz = ("-izzle");
            System.out.print(initial + ". " + Did + lname + " " + fname + izz);
        }
    }
