package com.company;
import java.util.*;

public class inclassarray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("How many numbers should there be? (5-10 please!)");
        int numbers = console.nextInt();//the amount of random numbers created

        Random randy = new Random();
        int n = randy.nextInt();//makes random numbers

        int[] myArray = new int [numbers];

        for (int i=0; i<numbers; i++) {//gives numbers range
            myArray[i] = randy.nextInt((100)+1);
        }
        System.out.println(Arrays.toString(myArray));
        int x;//indexes that will swap
        int y;
        do {
            x = randy.nextInt(numbers);
            y = randy.nextInt(numbers);
        }
        while (x==y);

        myArray = swap(myArray, x, y, numbers);
        System.out.println ("Swapped: "+Arrays.toString(myArray));
    }

    public static int[] swap (int [] a1, int a, int b, int numbers){
        int temp = a1[a];//swaps the indexes with eachother
        a1[a] = a1[b];
        a1[b] = temp;
        return a1;
    }
}