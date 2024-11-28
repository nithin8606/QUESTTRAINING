package com.quest.oops.exceptionhandling;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int age, double salary, int teamSize) throws InvalidInputException {
        super(name, age, salary);
        if (teamSize < 1) {
            throw new IllegalArgumentException("Team size must be greater than zero.");
        }
        this.teamSize = teamSize;
    }

    @Override
    public String toString() {
        return "Manager Details:\n" +
                "Name: " + getName() + ", Age: " + getAge() + ", Salary: " + getSalary() + ", Team Size: " + teamSize;
    }

    @Override
    public void displayDetails() {
        System.out.println(this.toString());
    }
}

