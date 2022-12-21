package com.SURAJ;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double taxable_income;
        double basic = 37700, higher = 150000;
        double basic_tax, higher_tax, total_tax, additional_tax;
        double basic_tax_rate = 0.20, higher_tax_rate = 0.40, additional_tax_rate = 0.45;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Annual Income");
        taxable_income = input.nextDouble();

        if (taxable_income != 0 ) {
            if (taxable_income <= basic) {
                basic_tax = basic * basic_tax_rate;
                System.out.println("Amount to pay : " + basic_tax);
                System.out.println("Your annual tax income : " + taxable_income);
            } else if (taxable_income <= higher) {
                basic_tax = basic * basic_tax_rate;
                higher_tax = (taxable_income * basic) * higher_tax_rate;
                total_tax = higher_tax + basic_tax;
                System.out.println("Amount to pay : " + total_tax);
                System.out.println("Your annual tax income : " + taxable_income);
            } else {
                basic_tax = basic * basic_tax_rate;
                additional_tax = (taxable_income * higher) * additional_tax_rate;
                total_tax = basic_tax + additional_tax;
                System.out.println("Amount to pay : " + total_tax);
                System.out.println("Your annual tax income : " + taxable_income);
            }

        }
        else
            System.out.println("You Enter An Invalid Digit = " + taxable_income);
    }
}
