package com.quest.practice_vars;

import java.util.Scanner;

public class SalaryManagement {
    public static void main(String[] args) {
        final int MAX_SALARY = 100000;
        Scanner sc = new Scanner(System.in);

        // Input: Number of employees
        System.out.print("Enter the number of Employees (1-100): ");
        int n = sc.nextInt();

        // Validate the number of employees
        while (n < 1 || n > 100) {
            System.out.print("Invalid number. Enter a value between 1 and 100: ");
            n = sc.nextInt();
        }

        // Loop through each employee to get their details
        for (int i = 1; i <= n; i++) {
            System.out.println("\nEmployee " + i + ":");

            // Employee's Name
            System.out.print("Enter your name: ");
            sc.nextLine();  // Clear the buffer
            String name = sc.nextLine();

            // Employee's Base Salary
            System.out.print("Enter your base salary: ");
            double baseSalary = sc.nextDouble();
            while (baseSalary < 0 || baseSalary > MAX_SALARY) {
                System.out.print("Invalid salary. Please enter a salary between 0 and " + MAX_SALARY + ": ");
                baseSalary = sc.nextDouble();
            }

            // Employee's Monthly Salaries
            double totalSalary = 0;
            for (int month = 1; month <= 12; month++) {
                System.out.print("Enter salary for month " + month + " (0-" + MAX_SALARY + "): ");
                double monthlySalary = sc.nextDouble();
                while (monthlySalary < 0 || monthlySalary > MAX_SALARY) {
                    System.out.print("Invalid salary. Please enter a salary between 0 and " + MAX_SALARY + ": ");
                    monthlySalary = sc.nextDouble();
                }
                totalSalary += monthlySalary;
            }

            // Calculate average monthly salary and bonus
            double averageSalary = totalSalary / 12.0;
            double bonus = totalSalary - (baseSalary * 12);

            // Employee Salary Report
            System.out.println("\n--- Employee Salary Report ---");
            System.out.println("Employee Name: " + name);
            System.out.println("Base Salary: " + baseSalary);
            System.out.println("Total Salary for the Year: " + totalSalary);
            System.out.println("Average Monthly Salary: " + averageSalary);
            System.out.println("Bonus: " + bonus);
        }

        sc.close();
    }
}

