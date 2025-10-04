package com.pluralsight;

public class TestStatistics {
    public static void main(String[] args){
         int[] testScores = {17, 13, 45, 37, 69, 84, 24, 52, 99, 89};

         int total = 0;
         int highScore = testScores[0];
         int lowScore = testScores[0];

         for (int i = 0; i < testScores.length; i++){
             total = total + testScores[i];
             if(testScores[i] > highScore){
                 highScore = testScores[i];
             }
             if(testScores[i] < lowScore){
                 lowScore = testScores[i];
             }
         }

         double average = (double) total / testScores.length;

        System.out.println("The average test score is: " + average);
        System.out.println("The highest score is: " + highScore);
        System.out.println("The lowest score is: " + lowScore);


    }
}
