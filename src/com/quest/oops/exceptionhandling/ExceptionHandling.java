package com.quest.oops.exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling {

    // Method that may throw exceptions
    public static void processOperations() throws ArithmeticException, ArrayIndexOutOfBoundsException, NullPointerException {
        Scanner scanner = new Scanner(System.in);

        try {
            // Accept two numbers and perform division
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            int result = num1 / num2;  // May throw ArithmeticException
            System.out.println("Division result: " + result);

            // Access an array at a specific index
            int[] array = {10, 20, 30, 40, 50};
            System.out.print("Enter an index (0-4): ");
            int index = scanner.nextInt();
            System.out.println("Array value at index " + index + ": " + array[index]);  // May throw ArrayIndexOutOfBoundsException

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        } catch (Exception e) {
            System.out.println("Error: Something went wrong.");
        } finally {
            System.out.println("Exception handling complete.");
        }
    }

    public static void main(String[] args) {
        try {
            processOperations();  // Call method that may throw exceptions
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        }
    }
}

