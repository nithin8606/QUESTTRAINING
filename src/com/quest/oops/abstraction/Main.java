package com.quest.oops.abstraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many animals do you want to add?");
        int n = scanner.nextInt();
        scanner.nextLine();

        Animal[] animals = new Animal[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for animal " + (i + 1) + ":");
            System.out.print("Enter animal type (Dog/Cat/Bird): ");
            String type = scanner.nextLine();

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            switch (type.toLowerCase()) {
                case "dog":
                    animals[i] = new Dog(name);
                    break;
                case "cat":
                    animals[i] = new Cat(name);
                    break;
                case "bird":
                    animals[i] = new Bird(name);
                    break;
                default:
                    System.out.println("Invalid type! Skipping this entry.");
                    animals[i] = null; // Handle invalid types
                    break;
            }
        }

        System.out.println("\n--- Animal Details ---");
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal);
            } else {
                System.out.println("Invalid or empty slot.");
            }
        }
    }
}

