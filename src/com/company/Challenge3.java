package com.company;

public class Challenge3 {
    public static final int SIZE = 6;
    private static char count;

    public static void main(String[] args) {
        TopABC();
        BottomABC();
    }

    private static void TopABC() {
        char letter = 65;
        for (int count = SIZE; count > 0; count--) {
            for (byte abc = 0; abc <= count - 1; abc++) {
                System.out.print((char) (letter + abc) + " ");
            }
            System.out.println("");
        }
    }

    private static void BottomABC() {
        char A = 65;
        for (int descend = 0; descend < SIZE; descend++) {
            for (byte abc = 0; abc <= descend; abc++) {
                System.out.print((char) (A + abc) + " ");
            }
            System.out.println("");
        }
    }
}


