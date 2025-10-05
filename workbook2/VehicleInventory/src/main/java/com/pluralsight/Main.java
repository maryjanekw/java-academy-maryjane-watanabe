package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Vehicle[] inventory = new Vehicle[20];
        int vehicleCount = 6;

//        inventory[0] = new Vehicle();
//        inventory[0].setVehicleId(101121);
//        inventory[0].setMakeModel("Ford Explorer");
//        inventory[0].setColor("Red");
//        inventory[0].setOdometerReading(45000);
//        inventory[0].setPrice(13500);
//
//        inventory[1] = new Vehicle();
//        inventory[1].setVehicleId(101122);
//        inventory[1].setMakeModel("Toyota Camry");
//        inventory[1].setColor("Blue");
//        inventory[1].setOdometerReading(60000);
//        inventory[1].setPrice(11000);
//
//        inventory[2] = new Vehicle();
//        inventory[2].setVehicleId(101123);
//        inventory[2].setMakeModel("Chevrolet Malibu");
//        inventory[2].setColor("Black");
//        inventory[2].setOdometerReading(50000);
//        inventory[2].setPrice(9700);
//
//        inventory[3] = new Vehicle();
//        inventory[3].setVehicleId(101124);
//        inventory[3].setMakeModel("Honda Civic");
//        inventory[3].setColor("White");
//        inventory[3].setOdometerReading(70000);
//        inventory[3].setPrice(7500);
//
//        inventory[4] = new Vehicle();
//        inventory[4].setVehicleId(101125);
//        inventory[4].setMakeModel("Subaru Outback");
//        inventory[4].setColor("Green");
//        inventory[4].setOdometerReading(55000);
//        inventory[4].setPrice(14500);
//
//        inventory[5] = new Vehicle();
//        inventory[5].setVehicleId(101126);
//        inventory[5].setMakeModel("Jeep Wrangler");
//        inventory[5].setColor("Yellow");
//        inventory[5].setOdometerReading(30000);
//        inventory[5].setPrice(16000);

        inventory[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        inventory[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        inventory[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        inventory[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        inventory[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        inventory[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);


        boolean running = true;
        while (running) {
            // Menu
            System.out.println("\nWhat do you want to do?");
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Search by price range");
            System.out.println("4 - Search by color");
            System.out.println("5 - Add a vehicle");
            System.out.println("6 - Quit");
            System.out.print("Enter your command: ");
            int command = read.nextInt();
            read.nextLine();

            switch (command) {
                case 1: // List all vehicles
                    for (int i = 0; i < vehicleCount; i++) {
                        System.out.println(inventory[i]);
                    }
                    break;

                case 2: // Search by make/model
                    System.out.print("Enter make/model to search: ");
                    String model = read
                            .nextLine();
                    for (int i = 0; i < vehicleCount; i++) {
                        if (inventory[i].getMakeModel().equalsIgnoreCase(model)) {
                            System.out.println(inventory[i]);
                        }
                    }
                    break;

                case 3: // Search by price range
                    System.out.print("Enter minimum price: ");
                    float min = read.nextFloat();
                    System.out.print("Enter maximum price: ");
                    float max = read.nextFloat();
                    for (int i = 0; i < vehicleCount; i++) {
                        if (inventory[i].getPrice() >= min && inventory[i].getPrice() <= max) {
                            System.out.println(inventory[i]);
                        }
                    }
                    break;

                case 4: // Search by color
                    System.out.print("Enter color to search: ");
                    String color = read.nextLine();
                    for (int i = 0; i < vehicleCount; i++) {
                        if (inventory[i].getColor().equalsIgnoreCase(color)) {
                            System.out.println(inventory[i]);
                        }
                    }
                    break;

                case 5: // Add a new vehicle
                    if (vehicleCount >= inventory.length) {
                        System.out.println("Inventory full!");
                        break;
                    }

                    System.out.print("Enter vehicleId: ");
                    long id = read.nextLong();
                    read.nextLine();
                    System.out.print("Enter make/model: ");
                    String newModel = read.nextLine();
                    System.out.print("Enter color: ");
                    String newColor = read.nextLine();
                    System.out.print("Enter odometer reading: ");
                    int odo = read.nextInt();
                    System.out.print("Enter price: ");
                    float newPrice = read.nextFloat();

                    inventory[vehicleCount] = new Vehicle(id, newModel, newColor, odo, newPrice);
                    vehicleCount++;
                    System.out.println("Vehicle added!");
                    break;

                case 6: // Quit
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option, try again.");

            }
        }
        read.close();
    }
}