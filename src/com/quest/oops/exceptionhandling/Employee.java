package com.quest.oops.exceptionhandling;

public class Employee implements EmployeeDetails {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) throws InvalidInputException {
        if (age < 18) {
            throw new InvalidInputException("Age must be 18 or older.");
        }
        if (salary < 0) {
            throw new InvalidInputException("Salary cannot be negative.");
        }
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}
