package com.pluralsight;


import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Select size of sandwich");
        System.out.println("1: Regular $5.45");
        System.out.println("2: Large $8.95");
        int sizeChoice = scanner.nextInt();

        double basePrice = 0.0;

        if (sizeChoice == 1) {
            basePrice = 5.45;
        } else if (sizeChoice == 2) {
            basePrice = 8.95;
        } else {
            System.out.println("Please Select an Option");
            return;
        }

        System.out.println("Please Enter Your Age: ");
        int age = scanner.nextInt();
        double discount = 0.0;

        if (age <= 17) {
            discount = 0.10;
        } else if (age >= 65) {
            discount = 0.20;
        }
        double finalPrice = basePrice * (1 - discount);
        System.out.println("The Total Price is: " + finalPrice);


    }

}
