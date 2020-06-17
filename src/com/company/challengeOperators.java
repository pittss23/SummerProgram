package com.company;
import java.util.Scanner;
import java.util.function.IntToDoubleFunction;
//Sydney Pitts
//6/17/20

//import and label scanner
//ask user for cost of meal, then percentage tip and tax they want (three different times)
//label the inputs as double meal_cost, int tip_percent, tax_percent
//insert method
//create method outside {}
//convert tip and tax to doubles
//divide tip_percent and tax_percent by 100
//multiply new tip and tax by cost of the meal
//add tip, tax, and meal together
//use round function on the total
//print this answer

public class challengeOperators {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the cost of your meal:");
        double meal_cost = keyboard.nextDouble();
        System.out.println("Please enter your tip:");
        int tip_percent = keyboard.nextInt();
        System.out.println("Please enter your tax:");
        int tax_percent = keyboard.nextInt();
        solve(meal_cost, tip_percent, tax_percent);
    }
    static void solve(double meal_cost, int tip_percent, int tax_percent){
        double tip=meal_cost*((0.0 + tip_percent)/100);//I used 0.0 because it converted tip_percent to a double
        double tax=meal_cost*((0.0 + tax_percent)/100);
        double total_cost=Math.round(meal_cost+tip+tax);
        System.out.print(total_cost);

    }
}
