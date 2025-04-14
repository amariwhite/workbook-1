package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
int bobSalary = 50000;
int garySalary = 75000;
int highestSalary = Math.max(bobSalary,garySalary);
System.out.println(highestSalary);

int carPrice = 25000;
int truckPrice = 85000;
int lowestPrice = Math.min(carPrice, truckPrice);
System.out.println("The Lowest Price is " + lowestPrice);

double radiusOfCircle = 7.25;
double areaOfCircle = Math.PI * Math.pow(radiusOfCircle, 2);
System.out.println(areaOfCircle);

double number = 5.0;
double squareRoot = Math.sqrt(number);
System.out.println("The Square Root" + number + "is " + squareRoot);

double x1 = 5;
double x2 = 85;
double y1 = 10;
double y2 = 50;
double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 -y1, 2));
System.out.println("The Distance is " + distance);

double myVariable = -3.8;
double absoluteValue = Math.abs(myVariable);
System.out.println(absoluteValue);

double randomNumber = Math.random();
System.out.println("Random number between 0 and 1 " + " is " + randomNumber);
    }
}
