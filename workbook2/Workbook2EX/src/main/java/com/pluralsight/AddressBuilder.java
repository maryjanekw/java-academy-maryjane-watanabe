package com.pluralsight;

import java.util.*;

public class AddressBuilder {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        //Billing Address
        System.out.println("Please enter your First name: ");
        String firstName = read.nextLine();

        String lowercaseFirstName = firstName.toLowerCase();
        String firstLetterOfFirstName = firstName.substring(0,1).toUpperCase();
        String everyThingAfterTheFirstLetter = lowercaseFirstName.substring(1);
        String formatedFirstName = firstLetterOfFirstName  + everyThingAfterTheFirstLetter;

        System.out.println("Please enter your Last name: ");
        String lastName = read.nextLine();

        String lowercaseLastName = lastName.toLowerCase();
        String firstLetterOfLastName  = lastName.substring(0,1).toUpperCase();
        everyThingAfterTheFirstLetter = lowercaseLastName.substring(1);
        String formatedLastName = firstLetterOfLastName + everyThingAfterTheFirstLetter;

        String fullName = formatedFirstName + " " + formatedLastName;

        System.out.println("Billing Street: ");
        String street = read.nextLine();

        System.out.println("Billing City: ");
        String city = read.nextLine();

        System.out.println("Billing State: ");
        String state = read.nextLine();

        System.out.println("Billing Zipcode: ");
        String zipcode = read.nextLine();

        StringBuilder address = new StringBuilder();
        address.append(street.toUpperCase() +"\n");
        address.append(city.toUpperCase() + ", ");
        address.append(state.toUpperCase() + " ");
        address.append(zipcode);

        String billingAddress = address.toString();

        //Shipping Address
        System.out.println("Shipping Street: ");
        street = read.nextLine();

        System.out.println("Shipping City: ");
        city = read.nextLine();

        System.out.println("Shipping State: ");
        state = read.nextLine();

        System.out.println("Shipping Zipcode: ");
        zipcode = read.nextLine();

        read.close();

        address = new StringBuilder();
        address.append(street.toUpperCase() +"\n");
        address.append(city.toUpperCase() + ", ");
        address.append(state.toUpperCase() + " ");
        address.append(zipcode);

        String shippingAddress = address.toString();

        System.out.println(fullName + "\n");
        System.out.println("Billing Address: \n" + billingAddress + "\n");
        System.out.println("Shipping Address: \n" + shippingAddress + "\n");
    }

}
