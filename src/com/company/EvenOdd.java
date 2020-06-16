package com.company;

public class EvenOdd {
    public static void main(String[] args) {
        Even();
        System.out.println(" )");
        Odd();
    }

    public static void Even() {
        for (int line = 0; line <= 100; line += 2)
            System.out.print(line + " ");
    }

    public static void Odd() {
        for (int line = 1; line <= 100; line += 1)
            System.out.print(line + " ");
    }
}

