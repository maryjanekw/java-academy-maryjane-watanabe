package com.pluralsight;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        double num1, num2, result;

        System.out.println("Enter first number: ");
        num1 = myScanner.nextInt();

        System.out.println("Enter operator (+, -, *, /): ");
        char operator = myScanner.next().charAt(0);

        System.out.println("Enter second number: ");
        num2 = myScanner.nextInt();

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
        }

        myScanner.close();

    }

}

