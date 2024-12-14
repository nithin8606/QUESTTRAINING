package com.quest.thread.synchronization;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    int id;
    String name;
    String department;
    double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "HR", 60000),
                new Employee(2, "Bob", "Finance", 45000),
                new Employee(3, "Charlie", "HR", 30000),
                new Employee(4, "David", "IT", 75000)
        );

        // Group by department
        Map<String, List<String>> groupedByDept = employees.stream()
                .collect(Collectors.groupingBy(e -> e.department,
                        Collectors.mapping(e -> e.name, Collectors.toList())));
        System.out.println("Grouped by Department: " + groupedByDept);

        // Filter employees with salary > 50000 and sort by name
        List<String> highEarners = employees.stream()
                .filter(e -> e.salary > 50000)
                .sorted(Comparator.comparing(e -> e.name))
                .map(e -> e.name)
                .collect(Collectors.toList());
        System.out.println("Employees with salary > 50000: " + highEarners);

        // Find employee with the highest salary
        Employee highestPaid = employees.stream()
                .max(Comparator.comparingDouble(e -> e.salary))
                .orElse(null);
        System.out.println("Employee with highest salary: " + highestPaid.name);
    }
}
