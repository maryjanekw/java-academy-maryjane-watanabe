package com.pluralsight;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//=================================================
// 1. STRINGS
//================================================
        System.out.println("=== STRINGS ===");

        String name = "Remsey";
        System.out.println("Hello, " + name); // Concatenation

// String methods
        System.out.println("Length of name: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("LowercASE: " + name.toLowerCase());
        System.out.println("First letter: " + name.charAt(0));   //R
        System.out.println("Does it contain 'sey'? " + name.contains("sey")); //true or false

        String movieTitle = "Jeepers Creepers";
        System.out.println("Uppercase: " + movieTitle.toUpperCase());

//=================================================
// 2. LOOP
//================================================
        System.out.println("\n=== LOOP===");
        Scanner myScanner = new Scanner(System.in);

        //For loop
        System.out.println("Counting from 1 to 5:");
        for (int counter = 0; counter <= 5; counter++) {
            System.out.println("Number " + counter);

            // For loop
            for (int i = 0; i < 3; i++) {
                System.out.println("Move forward!");

                // For loop;
                for (i = 0; i < 3; i++) {
                    System.out.println("You guys are cool!");

// Example 2
// While loop
                    System.out.println("\nWhile loop example:");
                    counter = 3;
                    while (counter > 0) {
                        System.out.println("Counter is: " + counter);
                        counter--; // decrease by 1

                    // While loop
                    System.out.println("\nPassword is incorrect: ");

                    boolean passwordIncorrect;
                    String password = "1234";
                    String enterPassword = "";

                        while (!enterPassword.equals(password)) {
                            System.out.println("What is the password?");
                            enterPassword = myScanner.nextLine();
                            if (!enterPassword.equals(password)) ;
                            {
                                System.out.println("Incorrect");
                            }

                            passwordIncorrect = true;
                            password = "1234";
                            enterPassword = "";

                            while (passwordIncorrect = true) {
                                System.out.println("What is the password?");
                                enterPassword = myScanner.nextLine();
                                if (!enterPassword.equals(password)) ;
                                {
                                    System.out.println("Incorrect");
                                }{
                                    passwordIncorrect = false;



                                    // Do-while loop
                                    System.out.println("\nDo-while loop example:");
                                    int x = 0;
                                    do {
                                        System.out.println("x is: " + x);
                                        x++;
                                    } while (x < 3);


                                }

                            }
                        }
                    }
                }
            }

        }
    }
}