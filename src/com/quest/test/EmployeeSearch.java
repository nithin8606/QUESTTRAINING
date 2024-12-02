package com.quest.test;

import java.util.*;

public class EmployeeSearch {
    public static void main(String[] args) {
        Map<Integer, String> employees = new HashMap<>();

        employees.put(101, "violet");
        employees.put(102, "green");
        employees.put(103, "red");
        employees.put(104, "black");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID to search: ");
        int employeeId = scanner.nextInt();
        if (employees.containsKey(employeeId)) {
            System.out.println("Employee Name: " + employees.get(employeeId));
        } else {
            System.out.println("Employee ID not found.");
        }

        scanner.close();
    }
}

