package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter first number");
        float firstNumber = keyboard.nextFloat();

        System.out.println("Enter second number");
        float secondNumber = keyboard.nextFloat();


        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.println("Please select an option:");

        String operator = keyboard.nextLine();
        double answer = firstNumber * secondNumber;
        String message = String.format("%.2f * %.2f = %.2f",firstNumber, secondNumber, answer);
        System.out.println(message);
    }
}
