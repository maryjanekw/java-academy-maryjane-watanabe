package com.pluralsight;

import java.text.MessageFormat;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args){
     Scanner read = new Scanner(System.in);

     String firstName;
     String middleName;
     String lastName;
     String suffix;

        System.out.println("Enter First Name: ");
        firstName = read.nextLine();

        System.out.println("Enter Middle Name: ");
        middleName = read.nextLine();

        System.out.println("Enter Last Name: ");
        lastName = read.nextLine();

        System.out.println("Enter Suffix: ");
        suffix = read.nextLine();

        String fullName;
        if(middleName.isEmpty() && suffix.isEmpty()){
            fullName = firstName + " " + lastName;
            System.out.println(fullName);
        }else if (middleName.isEmpty()){
            fullName = firstName + " " + lastName + " " + suffix;
            System.out.println(fullName);
        }else if (suffix.isEmpty()){
            fullName = firstName + " " + middleName + " " + lastName;
            System.out.println(fullName);
        }else{
            fullName = firstName + " " + middleName + " " + lastName + " " + suffix;
            System.out.println(fullName);
        }


    }
}
