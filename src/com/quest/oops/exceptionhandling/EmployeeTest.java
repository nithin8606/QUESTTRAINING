package com.quest.oops.exceptionhandling;


import java.util.Scanner;
import java.util.InputMismatchException;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        EmployeeDetails employee = null;
        while (employee == null) {
            try {
                System.out.println("Enter Employee details:");
                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Age: ");
                int age = scanner.nextInt();

                System.out.print("Salary: ");
                double salary = scanner.nextDouble();

                employee = new Employee(name, age, salary);
                scanner.nextLine(); // to consume the remaining newline
            } catch (InvalidInputException e) {
                System.out.println("InvalidInputException: " + e.getMessage() + " Please re-enter details.");
            } catch (InputMismatchException e) {
                System.out.println("InputMismatchException: Invalid input type. Please enter valid details.");
                scanner.nextLine();  // Clear invalid input from buffer
            }
        }

        // Manager details input
        Manager manager = null;
        while (manager == null) {
            try {
                System.out.println("Enter Manager details:");
                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Age: ");
                int age = scanner.nextInt();

                System.out.print("Salary: ");
                double salary = scanner.nextDouble();

                System.out.print("Team Size: ");
                int teamSize = scanner.nextInt();

                manager = new Manager(name, age, salary, teamSize);
                scanner.nextLine(); // to consume the remaining newline
            } catch (InvalidInputException e) {
                System.out.println("InvalidInputException: " + e.getMessage() + " Please re-enter details.");
            } catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException: " + e.getMessage() + " Please re-enter details.");
            } catch (InputMismatchException e) {
                System.out.println("InputMismatchException: Invalid input type. Please enter valid details.");
                scanner.nextLine();  // Clear invalid input from buffer
            }
        }

        employee.displayDetails();
        manager.displayDetails();

        scanner.close();
    }
}

