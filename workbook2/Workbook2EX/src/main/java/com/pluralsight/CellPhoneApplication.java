package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone myPhone = new CellPhone();

        System.out.print("Enter serial number: ");
        myPhone.setSerialNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Enter model: ");
        myPhone.setModel(scanner.nextLine());

        System.out.print("Enter carrier: ");
        myPhone.setCarrier(scanner.nextLine());

        System.out.print("Enter phone number: ");
        myPhone.setPhoneNumber(scanner.nextLine());

        System.out.print("Enter owner: ");
        myPhone.setOwner(scanner.nextLine());

        System.out.println("\n Cell Phone Information:");
        System.out.println("Serial Number: " + myPhone.getSerialNumber());
        System.out.println("Model: " + myPhone.getModel());
        System.out.println("Carrier: " + myPhone.getCarrier());
        System.out.println("Phone Number: " + myPhone.getPhoneNumber());
        System.out.println("Owner: " + myPhone.getOwner());

        scanner.close();
    }
}
