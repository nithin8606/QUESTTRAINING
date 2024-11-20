package com.quest.oops.abstraction;

public class Person { // Renamed class to Person for clarity
    private String name;
    private int age;

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
    public static void main(String[] args) {
        // Creating an instance of Person using the constructor
        Person person = new Person("John Doe", 30);
        System.out.println(person); // Implicitly calls the toString method
    }
}
