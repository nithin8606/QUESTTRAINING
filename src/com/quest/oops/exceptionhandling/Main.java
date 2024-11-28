package com.quest.oops.exceptionhandling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        Operation addition = new Addition();
        Operation subtraction = new Subtraction();
        Operation division = new Division();

        System.out.println("\nPerforming Addition:");
        System.out.println(addition.toString() + " result: " + addition.performOperation(num1, num2));

        System.out.println("\nPerforming Subtraction:");
        System.out.println(subtraction.toString() + " result: " + subtraction.performOperation(num1, num2));

        System.out.println("\nPerforming Division:");
        try {
            System.out.println(division.toString() + " result: " + division.performOperation(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("Error during division: " + e.getMessage());
        }

        try {
            String result = null;
            System.out.println("Null string length: " + result.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Cannot access methods on a null object.");
        } finally {
            System.out.println("Program execution completed.");
        }

        scanner.close();
    }
}
