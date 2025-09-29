package com.pluralsight;

import java.util.*;


public class MortgageCalculator {

    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        //M = P × (i * (1 + i )^n / ( (1 + i)^n ) - 1)

        double monthlyPayments = 0; //(M)
        double principal = 0;  //(P)
        float annualInterestRate = 0.07625f; //(r)
        int loanTermYears = 0;  //(y)
        double numberMonthlyPayments = 12 * loanTermYears; //(n)
        double monthlyInterestRate = annualInterestRate / 12;  //(i)
        double totalInterest = (monthlyPayments * numberMonthlyPayments) - principal;

        System.out.println("Enter the Principal: $");
        principal = myScanner.nextInt();

        System.out.println("Enter the number of years to pay off the loan: ");
        loanTermYears = myScanner.nextInt();


        monthlyPayments = principal * (((monthlyInterestRate * (1 + monthlyInterestRate)*numberMonthlyPayments) / ((1 + monthlyInterestRate)*numberMonthlyPayments)) - 1);

        System.out.println("Your monthly payments will be: $" + monthlyPayments);
        System.out.println("Your total interest is: $" + totalInterest);


    }
}
