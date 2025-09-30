package com.pluralsight;

import java.util.*;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String fullName;

        System.out.println("Enter Full Name: ");
        fullName = read.nextLine();

        fullName = fullName.trim();

        String[] parts = fullName.split("\\s+");

        String firstName = "";
        String middleName = "";
        String lastName = "";

        if (parts.length == 2) {
            firstName = parts[0];
            lastName = parts[1];
        }else if (parts.length == 3){
            firstName = parts[0];
            middleName = parts[1];
            lastName = parts[2];

            System.out.println("First name: " + firstName);
            System.out.println("Middle name: " + middleName);
            System.out.println("Last name: " + lastName);
        }
        read.close();

    }
}
