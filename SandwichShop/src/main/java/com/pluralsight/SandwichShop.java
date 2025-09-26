package com.pluralsight;

import java.util.*;

public class SandwichShop {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);


        double regularSandwich = 5.45;
        double largeSandwich = 8.95;
        double studentDiscount = 10.0/100;
        double seniorsDiscount = 20.0/100;
        double resultSize = 0;
        double resultAge = 0;

        System.out.println("Would you like a regular or large sandwich?:");
        String sandwichSize = myScanner.nextLine();

        if (sandwichSize.equalsIgnoreCase("regular")){
            resultSize = regularSandwich;
            System.out.println(resultSize);
        } else if (sandwichSize.equalsIgnoreCase("large")){
            resultSize = largeSandwich;
            System.out.println(resultSize);
        }

        System.out.println("Enter your age:");
        int age = myScanner.nextInt();

        if (age <= 17) {
            resultAge = studentDiscount;
            System.out.println(resultAge);
        } else if (age >= 65) {
            resultAge = seniorsDiscount;
            System.out.println(resultAge);
        } else {
            System.out.println("No discount.");
        }

        double discount = resultSize * resultAge;
        double total = resultSize - discount;
        String formatted =
        String.format("%.2f",total);


        System.out.println("Cost:$" + formatted);

     myScanner.close();

    }
}