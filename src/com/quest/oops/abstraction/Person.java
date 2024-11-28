package com.quest.oops.abstraction;

public class Person {
    private String name;
    private int age;

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Overriding toString method to provide a custom string representation
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    // Method to change reference to another Person object
    public void changeRef(Person newPerson) {
        this.name = newPerson.getName(); // Updating current person's name to new person's name
        this.age = newPerson.getAge(); // Updating current person's age to new person's age
    }

    public static void main(String[] args) {
        // Creating two person objects
        Person person1 = new Person("John Doe", 30);
        Person person2 = new Person("Jane Smith", 25);

        // Printing the initial details of person1 and person2
        System.out.println("Before changeRef:");
        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);

        // Changing reference of person1 to person2
        person1.changeRef(person2); // Now person1 will hold the same data as person2

        // Printing after calling changeRef
        System.out.println("\nAfter changeRef:");
        System.out.println("Person 1 (after changeRef): " + person1);
        System.out.println("Person 2 (unchanged): " + person2);
    }
}
// (toString(), changeRef(), equals(), hashCode(), clone())
//different type of relationship
//different type of inheritace
//difference b/t abtract and interface
//Decorator Pattern
//parameter passing
//pass by value
//Preference in Parameters