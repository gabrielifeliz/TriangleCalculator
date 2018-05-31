package com.company;

/*
    TriangleCalculator.java

    Write a program that allows the user to enter the length of the three sides of a triangle.
    The program should then display whether the triangle is an equilateral triangle or not.
    If the triangle is not an equilateral triangle then the program should display
    if the triangle is a right triangle or not. The Pythagorean theorem tells us that
    the square of one side equals the sum of the squares of the other sides for all right triangles.

*/

import java.util.Scanner;

public class TriangleCalculator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter first side of triangle: ");
        int side1 = keyboard.nextInt();

        System.out.println("Enter second side of triangle: ");
        int side2 = keyboard.nextInt();

        System.out.println("Enter third side of triangle: ");
        int side3 = keyboard.nextInt();

        if ((side1 == side2) && (side2 == side3)) {
            System.out.println("This triangle is equilateral");
        } else {
            System.out.println("This triangle is not equilateral");

            if (Math.pow(side1, 2) == Math.sqrt((Math.pow(side2, 2) + Math.pow(side3, 2)))) {
                System.out.println("This triangle is a right triangle");
            } else if (Math.pow(side2, 2) == Math.sqrt((Math.pow(side1, 2) + Math.pow(side3, 2)))){
                System.out.println("This triangle is a right triangle");
            } else if (Math.pow(side3, 2) == Math.sqrt((Math.pow(side1, 2) + Math.pow(side2, 2)))){
                System.out.println("This triangle is a right triangle");
            } else {
                System.out.println("This triangle is not a right triangle");
            }
        }

    }
}
