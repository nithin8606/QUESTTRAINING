package com.quest.oops.encapsulation;

import java.util.Scanner;
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Account account;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Banking System ---");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. View Account Details");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createSavingsAccount();
                    break;
                case 2:
                    createCurrentAccount();
                    break;
                case 3:
                    depositMoney();
                    break;
                case 4:
                    withdrawMoney();
                    break;
                case 5:
                    viewAccountDetails();
                    break;
                case 6:
                    System.out.println("Exiting. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
    }

    private static void createSavingsAccount() {
        System.out.print("Enter Account Number: ");
        String accNum = scanner.next();
        System.out.print("Enter Account Holder Name: ");
        String accHolder = scanner.next();
        account = new SavingsAccount(accNum, accHolder, 5000.0);  // Initial balance 5000
        System.out.println("Savings Account created successfully!");
    }

    private static void createCurrentAccount() {
        System.out.print("Enter Account Number: ");
        String accNum = scanner.next();
        System.out.print("Enter Account Holder Name: ");
        String accHolder = scanner.next();
        account = new CurrentAccount(accNum, accHolder, 5000.0);  // Initial balance 5000
        System.out.println("Current Account created successfully!");
    }

    private static void depositMoney() {
        if (account == null) {
            System.out.println("No account exists! Create an account first.");
            return;
        }
        System.out.print("Enter Deposit Amount: ");
        double amount = scanner.nextDouble();
        account.deposit(amount);  // Balance is updated here
        System.out.println("Current Balance: " + account.getBalance());
    }

    private static void withdrawMoney() {
        if (account == null) {
            System.out.println("No account exists! Create an account first.");
            return;
        }
        System.out.print("Enter Withdraw Amount: ");
        double amount = scanner.nextDouble();
        account.withdraw(amount);  // Balance is updated here
        System.out.println("Current Balance: " + account.getBalance());
    }

    private static void viewAccountDetails() {
        if (account == null) {
            System.out.println("No account exists! Create an account first.");
            return;
        }
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + account.accountNumber);
        System.out.println("Account Holder: " + account.accountHolderName);
        System.out.println("Current Balance: " + account.getBalance());
    }
}
