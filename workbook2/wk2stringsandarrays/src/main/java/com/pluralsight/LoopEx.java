package com.pluralsight;

import java.sql.SQLOutput;
import java.util.*;

public class LoopEx {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("I will be a developer!");
        }
        System.out.println("Year Up Code Academy countdown:");
        for (int counter = 81; counter >= 1; counter--) {
            System.out.println(counter + " more days left at Year Up Code Academy");
        }

//        // 1. FOR LOOP
//        // Use when you know how many times you want to repeat
//        System.out.println("For Loop: Counting from 1 to 5");
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Iteration " + i);
//        }
//
//        // 2. WHILE LOOP
//        // Use when you don't know how many times in advance
//        System.out.println("\nWhile Loop: Counting down from 5");
//        int j = 5;
//        while (j > 0) {
//            System.out.println("Countdown: " + j);
//            j--;
//        }
//
//        // 3. DO...WHILE LOOP
//        // Always runs at least once, even if condition is false
//        System.out.println("\nDo...While Loop: Run at least once");
//        int k = 0;
//        do {
//            System.out.println("This will print once, even though k = " + k);
//            k--;
//        } while (k > 0);


//        Java Loop Examples
//        This gist demonstrates three types of loops in Java:
//
//        for loop → best when you know the number of iterations
//        while loop → best when the condition controls the loop
//        do...while loop → guarantees at least one execution
//✏️ Exercises
//        Modify the for loop to print only even numbers.
//        Change the while loop into a countdown timer. (Use Thread.sleep(1000) to pauze the countdown for a second)
//        Add a do...while loop that asks the user for input until they type "exit".


        System.out.println("For Loop: Printing even numbers from 1 to 6");
        for (int i = 1; i <= 6; i++) {
            if (i % 2 == 0) {
                System.out.println("Even numbers " + i);
            }
        }

            System.out.println("\nWhile Loop: Counting down from 5");
            int j = 5;
            while (j > 0) {
                System.out.println("Countdown: " + j + "...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                j--;
            }


            String input;
            System.out.println("\nDo...While Loop: Enter 'exit' to stop");
            do {
                System.out.println("Enter the input: ");
                input = myScanner.nextLine();
            } while (!input.equalsIgnoreCase("exit"));
            System.out.println("Exited the loop. Goodbye!");

            myScanner.close();


        }
    }
