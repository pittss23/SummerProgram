package com.company;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class playingwarray {
    public static void main(String[] args) {
        //int[] intArray = new int[100];
        //Random randy = new Random();
        //for (int index = 0; index < intArray.length; index++) {
        //    System.out.println(intArray[index] = randy.nextInt(1000) + 1);

        //Arrays.sort(intArray);
        //boolean flag = false;//searching for character (linear search) - use break; to get out of the search/loop
        //int num = Arrays.binarySearch(intArray, 4);
        //if (num >= 0) {
        //    System.out.println(num + "is in the array");

        //else {
        //    System.out.print("The number is NOT in the array");
        int count;
        int amnt;
        int[] intArray = new int[0];
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer for how many days you would like to record");//initial code and I don't need to loop it
        amnt = input.nextInt();
        if ((amnt >= 2) && (amnt <= 100)) {
            intArray = new int[amnt];
        } else {
            System.out.print("error");
        }
        Random randy = new Random();
        int sum = 0;
        for (int index = 0; index < intArray.length; index++) {
            intArray[index] = randy.nextInt(110 - 25) + 25;
            System.out.println("Day " + (index + 1) + " temperature: " + intArray[index]);
            sum = sum + intArray[index];
        }
        double average = sum / intArray.length;
        System.out.println("The average of the numbers is " + average);
        count = 0;
        for (int i = 0; i < amnt; i++) {
            if (intArray[i] > average) {
                count++;
            }
        }
        System.out.println("There are " + count + " numbers above the average");
    }
}


