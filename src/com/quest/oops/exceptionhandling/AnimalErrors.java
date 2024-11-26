package com.quest.oops.exceptionhandling;

public class AnimalErrors {

    // Animal class with basic properties
    static class Animal {
        String name;

        public Animal(String name) {
            this.name = name;
        }
    }

    // 1. Method to demonstrate StackOverflowError (Recursion without termination)
    public static void causeStackOverflow(Animal animal) {
        System.out.println(animal.name + " is asking for help...");
        causeStackOverflow(animal); // Recursively calls itself (no termination condition)
    }

    // 2. Method to demonstrate OutOfMemoryError (Creating too many objects in memory)
    public static void causeOutOfMemory() {
        int counter = 0;
        while (true) {
            // Continuously create new Animal objects without storing them
            Animal animal = new Animal("Animal " + counter++);
            System.out.println("Created: " + animal.name);
        }
    }

    public static void main(String[] args) {
        // StackOverflowError Example
        try {
            Animal lion = new Animal("Lion");
            causeStackOverflow(lion); // Start the recursion
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError occurred!");
            e.printStackTrace(); // Print the stack trace of the error
        }

        // OutOfMemoryError Example
        try {
            causeOutOfMemory(); // Start creating objects in memory
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError occurred!");
            e.printStackTrace(); // Print the stack trace of the error
        }
    }
}

