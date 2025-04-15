package com.pluralsight;

public class BrushingTeeth {
    public static void main(String[] args) {
        brushingTeeth();

        String favoriteMovie = favoriteMovie();
        System.out.println("My Favorite movie is: " + favoriteMovie);

        int sum = addTwoNumbers(500, 600);
        System.out.println("The sum of adding two number is: " + sum);

    }

    public static void brushingTeeth() {
        System.out.println("Steps to Brush your teeth: ");
        System.out.println("Step 1: Wet toothbrush and apply toothpaste");
        System.out.println("Step 2: Brush teeth in circular motions");
        System.out.println("Step 3: Spit out toothpaste and rinse mouth");
    }
    public static String favoriteMovie() {
        return "The Devil Wears Prada";

    }
    public static int addTwoNumbers(int a, int b) {
        return a + b;
    }

}

