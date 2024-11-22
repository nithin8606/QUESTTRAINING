package com.quest.oops.exceptionhandling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Accepting two numbers from the user
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Perform addition
            int additionResult = num1 + num2;
            System.out.println("Addition result: " + additionResult);

            // Perform subtraction
            int subtractionResult = num1 - num2;
            System.out.println("Subtraction result: " + subtractionResult);

            // Perform division with exception handling for division by zero
            System.out.println("Trying to perform division...");
            int divisionResult = num1 / num2;  // May throw ArithmeticException if num2 is 0
            System.out.println("Division result: " + divisionResult);

            // Simulate NullPointerException
            String nullString = null;
            System.out.println("Trying to print the length of a null string...");
            System.out.println("String length: " + nullString.length());  // This will throw NullPointerException

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (NullPointerException e) {
            System.out.println("Error: Null value encountered.");
        } catch (Exception e) {
            System.out.println("Error: An unexpected error occurred.");
        } finally {
            System.out.println("Exception handling completed.");
        }

        scanner.close();
    }
}
