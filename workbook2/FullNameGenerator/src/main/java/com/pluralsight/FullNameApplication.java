package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args){
     Scanner read = new Scanner(System.in);

     String firstName;
     String middleName;
     String lastName;
     String suffix;

//     Ramsey example:
//      String myName = "JeFfreyy";
//      String lowercaseName = myName.toLowerCase();
//      String firstLetter = myName.substring(0,1).toUpperCase();
//      String everyThingAfterTheFirstLetter = lowercaseName.substring(1);
//      String formatedName = firstLetter + everyThingAfterTheFirstLetter;
//      System.out.println(formatedName);


        System.out.println("Enter First Name: ");
        firstName = read.nextLine().trim();

        String lowercaseFirstName = firstName.toLowerCase();
        String firstLetterOfFirstName = firstName.substring(0,1).toUpperCase();
        String everyThingAfterTheFirstLetter = lowercaseFirstName.substring(1);
        String formatedFirstName = firstLetterOfFirstName  + everyThingAfterTheFirstLetter;

        System.out.println("Enter Middle Name: ");
        middleName = read.nextLine().trim();

        String lowercaseMiddleName = middleName.toLowerCase();
        String firstLetterOfMiddleName  = middleName.substring(0,1).toUpperCase();
        everyThingAfterTheFirstLetter = lowercaseMiddleName.substring(1);
        String formatedMiddleName = firstLetterOfMiddleName + everyThingAfterTheFirstLetter;

        System.out.println("Enter Last Name: ");
        lastName = read.nextLine().trim();

        String lowercaseLastName = lastName.toLowerCase();
        String firstLetterOfLastName  = lastName.substring(0,1).toUpperCase();
        everyThingAfterTheFirstLetter = lowercaseLastName.substring(1);
        String formatedLastName = firstLetterOfLastName + everyThingAfterTheFirstLetter;

        System.out.println("Enter Suffix: ");
        suffix = read.nextLine().trim();

//        String lowercaseSuffix = suffix.toLowerCase();
//        String firstLetterOfSuffix  = suffix.substring(0,1).toUpperCase();
//        everyThingAfterTheFirstLetter = lowercaseSuffix.substring(1);
//        String formatedSuffix = firstLetterOfSuffix + everyThingAfterTheFirstLetter;

        String fullName;
        if(middleName.isEmpty() && suffix.isEmpty()){
            fullName = formatedFirstName + " " + formatedLastName;
            System.out.println(fullName);
        }else if (middleName.isEmpty()){
            fullName = formatedFirstName + " " + formatedLastName + " " + suffix;
            System.out.println(fullName);
        }else if (suffix.isEmpty()){
            fullName = formatedFirstName + " " + formatedMiddleName + " " + formatedLastName;
            System.out.println(fullName);
        }else{
            fullName = formatedFirstName + " " + formatedMiddleName + " " + formatedLastName + " " + suffix;
            System.out.println(fullName);
        }

        read.close();
    }
}
