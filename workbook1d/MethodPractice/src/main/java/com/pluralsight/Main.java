package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
 //if user type is password 1234 write password is correct
        //Else write password is incorrect


        System.out.println("Enter the password: ");
        String password = myScanner.nextLine();


        if (password.equals("1234")) {
            System.out.println("Correct!");
        }else{
            System.out.println("Try again!");
        }








    }
}