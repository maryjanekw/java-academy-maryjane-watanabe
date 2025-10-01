package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        // example game score- Home:Visitor|21:9
        //  Diasomnia:Ignhiyde|13:9

        System.out.println("Please enter the teams scores (team1:team2|team1score:team2score): ");
        String input = read.nextLine();

        String[] parts = input.split("\\|");

        String[] teams = parts[0].split(":");
        String[] scores = parts[1].split(":");

        int team1Score = Integer.parseInt(scores[0]);
        int team2Score = Integer.parseInt(scores[1]);

        if (team1Score > team2Score){
            System.out.println("Winning team is " + teams[0] + "!!!");
        } else if (team1Score < team2Score){
            System.out.println("Winning team is " + teams[1] + "!!!");
        }else{
            System.out.println("It's a tie!");
        }

        read.close();
    }
}
