package com.company;

import java.util.Random.*;
public class equations {
    public static void main(String[] args) {
    double numb1=100.0;
    double numb2=5;
    double numb3=3;
    double numb4=Math.hypot(numb2,numb3);
    double numb5=Math.pow(numb4, 2);
    double numb6=Math.sqrt(numb5);
    System.out.printf("\n %8.3f \n ", numb6);
    }
}
