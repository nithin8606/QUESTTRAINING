package com.quest.casestudy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SubscriberManagementSystem.loadData();

        Scanner scanner = new Scanner(System.in);
        SubscriberManagementSystem system = new SubscriberManagementSystem();

        while (true) {
            System.out.println("\n1. Add Subscriber");
            System.out.println("2. Update Balance (Prepaid)");
            System.out.println("3. Record Call");
            System.out.println("4. Display Subscribers");
            System.out.println("5. Generate Bill (Postpaid)");
            System.out.println("6. Display Call History");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter Plan Type (Prepaid/Postpaid): ");
                    String planType = scanner.nextLine();
                    System.out.print("Enter Balance: ₹");
                    double balance = scanner.nextDouble();
                    system.addSubscriber(id, name, phoneNumber, planType, balance);
                    System.out.println("Subscriber added successfully!");
                    break;
                case 2:
                    System.out.print("Enter Subscriber ID to Update Balance: ");
                    id = scanner.nextLine();
                    System.out.print("Enter Amount to Add: ₹");
                    double amount = scanner.nextDouble();
                    system.updateBalance(id, amount);
                    System.out.println("Balance updated successfully!");
                    break;
                case 3:
                    System.out.print("Enter Subscriber ID to Record Call: ");
                    id = scanner.nextLine();
                    System.out.print("Enter Call Type (Local/STD/ISD): ");
                    String callType = scanner.nextLine();
                    System.out.print("Enter Call Duration (in minutes): ");
                    double duration = scanner.nextDouble();
                    system.recordCall(id, callType, duration);
                    System.out.println("Call recorded successfully!");
                    break;
                case 4:
                    system.displaySubscribers();
                    break;
                case 5:
                    System.out.print("Enter Subscriber ID to Generate Bill: ");
                    id = scanner.nextLine();
                    system.generateBill(id);
                    break;
                case 6:
                    System.out.print("Enter Subscriber ID to Display Call History: ");
                    id = scanner.nextLine();
                    system.displayCallHistory(id);
                    break;
                case 7:
                    SubscriberManagementSystem.saveData();
                    System.out.println("Data saved successfully. Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");

            }
        }
    }
}
