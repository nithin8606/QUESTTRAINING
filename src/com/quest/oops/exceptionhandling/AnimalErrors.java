package com.quest.oops.exceptionhandling;

import java.util.Scanner;

public class AnimalErrors {

    static class Animal {
        String name;

        public Animal(String name) {
            this.name = name;
        }
    }

    public static void causeStackOverflow(Animal animal) {
        System.out.println(animal.name + " is asking for help...");
        System.out.println("Press 'q' to stop the process.");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("q")) {
            System.out.println("Process terminated by user.");
            return;  // Terminate recursion
        }

        causeStackOverflow(animal);
    }

    public static void causeOutOfMemory() {
        int counter = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {

            Animal animal = new Animal("Animal " + counter++);
            System.out.println("Created: " + animal.name);

            System.out.println("Press 'q' to stop creating objects.");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                System.out.println("Process terminated by user.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option to cause an error or terminate:");
        System.out.println("1. Cause StackOverflowError");
        System.out.println("2. Cause OutOfMemoryError");
        System.out.println("Enter 'q' to quit.");
        System.out.print("Enter your choice (1 or 2): ");

        String choice = scanner.nextLine();
        try {
            if (choice.equals("1")) {
                Animal lion = new Animal("Lion");
                causeStackOverflow(lion);
            } else if (choice.equals("2")) {
                causeOutOfMemory();
            } else if (choice.equalsIgnoreCase("q")) {
                System.out.println("Exiting the program.");
            } else {
                System.out.println("Invalid choice! Please enter 1, 2, or 'q' to quit.");
            }
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError occurred!");
            e.printStackTrace();
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError occurred!");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}

