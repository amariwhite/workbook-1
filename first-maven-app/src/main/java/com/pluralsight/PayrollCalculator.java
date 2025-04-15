package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter you name");
        String name = keyboard.nextLine();

        System.out.println("Enter Hours Worked");
        float hoursWorked = keyboard.nextFloat();

        System.out.println("Enter you pay rate");
        float payRate = keyboard.nextFloat();

        float grossPay = hoursWorked * payRate;
       System.out.printf("Employee Name: %s %n ", name);
       System.out.printf("Gross pay %.2f", grossPay);

    }

}
