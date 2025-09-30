package com.pluralsight;

public class SubStringEx {
    public static void main(String[] args) {

        String productCode = "ACME-12213";
        int dashPosition = productCode.indexOf("-"); //4

        System.out.println(dashPosition);
        String vendor = productCode.substring(0, dashPosition);  // cut the text between 0 and 4 characters
        System.out.println(vendor);
        String productNum = productCode.substring(dashPosition + 1);
        System.out.println(productNum);


        String firstname = "Nazik";
        String partOfTheName = firstname.substring(2, 4);
        System.out.println(partOfTheName);

        String myEmailAddress = "rmailjard@yEARup.OrG";
        int atIndex = myEmailAddress.indexOf("@");
        if (myEmailAddress.endsWith("yearup.org")) {
            System.out.println("Email is valid");
        }else{
            System.out.println("Email is invalid");

        }
    }
}