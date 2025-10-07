package com.pluralsight;

import java.io.*;       // For File, FileReader, BufferedReader, IOException
import java.net.URL;    // For loading resource as URL

public class SimpleCsvReader {
        public static void main(String[] args) throws Exception {

            // Load the CSV file from the 'resources' folder using the class loader
            URL resource = com.pluralsight.SimpleCsvReader.class.getClassLoader().getResource("data.csv");

            // If the file is not found, print a message and stop the program
            if (resource == null) {
                System.out.println("File not found!");
                return;
            }

            // Create a File object using the path from the resource URL
            File file = new File(resource.getFile());

            // Try-with-resources: Automatically closes the reader when done

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

                String line;

                reader.readLine();

                // Read the file line by line
                while ((line = reader.readLine()) != null) {
                  //  System.out.println(line); // Print each line (CSV row) to the console

                    String[] tokens = line.split("\\|");
                    int id = Integer.parseInt(tokens[0]);
                    String name = tokens[1];
                    double hoursWorked = Double.parseDouble(tokens[2]);
                    double payRate = Double.parseDouble(tokens[3]);

                    Employee e1 = new Employee(id, name, hoursWorked, payRate);
                    System.out.printf("ID: %d | Name: %-20s | Gross Pay: $%.2f%n",
                            e1.getEmployeeId(), e1.getName(), e1.getGrossPay());
                }

            } // reader is automatically closed here
        }
}
