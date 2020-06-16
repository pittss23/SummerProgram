package com.company;
//Sydney Pitts
public class Challenge2 {
public static final int SIZE=5;
    public static void main(String[] args) {
        Line();
        Triangle();
        UpsideDownTriangle();
        Line();
        UpsideDownTriangle();
        Triangle();
        Line();
    }

    public static void Line() {
        System.out.print("+");
        for (int dash = 0; dash < SIZE*2+1; dash++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void Triangle() {
        for (int line = 1; line < SIZE+1; line++) {
            System.out.print("|");
            for (int space = 1; space <= SIZE - line+1; space++) {
                System.out.print(" ");
            }
            for (int slash = 1; slash <= line-1; slash++) {
                System.out.print("/");
            }
            System.out.print("*");
            for (int slash = 1; slash <= line-1; slash++) {
                System.out.print("\\");
            }
            for (int space = 1; space <= SIZE - line+1; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

    }

    public static void UpsideDownTriangle() {
        for (int line = 1; line < SIZE+1; line++) {
            System.out.print("|");
            for (int space = 1; space <=line; space++) {
                System.out.print(" ");
            }
            for (int slash = 1; slash <=SIZE-line; slash++) {
                System.out.print("\\");
            }
            System.out.print("*");
            for (int slash = 1; slash <=SIZE-line; slash++) {
                System.out.print("/");
            }
            for (int space = 1; space <=line; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}



