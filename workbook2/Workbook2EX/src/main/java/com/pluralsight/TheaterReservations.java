package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class TheaterReservations {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        String fullName;
        String date;
        int numberOfTickets;

        System.out.println("Enter your name (Fist & Last Name): ");
        fullName = read.nextLine();

        String[] parts = fullName.trim().split("\\s+");

        String firstName = "";
        String lastName = "";

        if(parts.length>= 2){
            firstName = parts[0];
            lastName = parts[parts.length-1];
        }else if (parts.length == 1){
            firstName = parts[0];
        }

        String lowercaseFirstName = firstName.toLowerCase();
        String firstLetterOfFirstName = firstName.substring(0,1).toUpperCase();
        String everyThingAfterTheFirstLetter = lowercaseFirstName.substring(1);
        String formatedFirstName = firstLetterOfFirstName  + everyThingAfterTheFirstLetter;

        String lowercaseLastName = lastName.toLowerCase();
        String firstLetterOfLastName  = lastName.substring(0,1).toUpperCase();
        everyThingAfterTheFirstLetter = lowercaseLastName.substring(1);
        String formatedLastName = firstLetterOfLastName + everyThingAfterTheFirstLetter;

        System.out.println("What day will the reservation be (MM/dd/yyyy): ");
        date = read.nextLine();

        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate reservationDate = LocalDate.parse(date, formatter);

        System.out.println("How may tickets would you like?: ");
        numberOfTickets = read.nextInt();

        String tickets;

        if (numberOfTickets > 1){
            tickets = numberOfTickets + " tickets";
        }else{
            tickets = numberOfTickets + " ticket";
        }

        System.out.println(tickets + " reserved for " + reservationDate + " under " + formatedLastName + ", " + formatedFirstName);

    }
}
