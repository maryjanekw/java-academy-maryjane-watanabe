package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] famousQuotes = {"If you can't love yourself, how in the hell you gonna love somebody else?",
                "The best revenge is massive success",
                "You miss 100 percent of the shots you never take",
                "All that glitters is not gold.",
                "Frankly, my dear, I don't give a damn.",
                "Hell has no fury like a woman scorned.",
                "If you are going through hell, keep going.",
                "Keep your friends close, but your enemies closer.",
                "Life is like a box of chocolates. You never know what you’re gonna get.",
                "The only thing we have to fear is fear itself.",};

        Scanner read = new Scanner(System.in);
        System.out.println("Pick a number between 1 and 10: ");
        int number = read.nextInt();
        read.nextLine();

        if (number >= 1 && number <= 10) {
            System.out.println("Enjoy your random quote: ");
            System.out.println(famousQuotes[number - 1]);
        }else{
            System.out.println("Invalid number!!! Try again");
        }

        System.out.println("Would you like another quote? (yes/no): ");
        String input = read.nextLine();

        while(input.equalsIgnoreCase("yes")){
            System.out.println("Pick a number between 1 and 10: ");
            number = read.nextInt();
            read.nextLine();

            if (number >= 1 && number <= 10) {
                System.out.println("Enjoy your random quote: ");
                System.out.println(famousQuotes[number - 1]);
            }else{
                System.out.println("Invalid number!!! Try again");
            }
            System.out.println("Would you like another quote? (yes/no): ");
            input = read.nextLine();
        }
            System.out.println("Thank you! Good bye!");

        read.close();
    }
}