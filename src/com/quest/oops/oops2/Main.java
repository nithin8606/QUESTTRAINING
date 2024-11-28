package com.quest.oops.oops2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Regular Member");
            System.out.println("2. Add Premium Member");
            System.out.println("3. Add Book");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Display Books");
            System.out.println("7. Display Members");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Add Regular Member
                    System.out.print("Enter Member Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Member ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Membership Type: ");
                    String membershipType = scanner.nextLine();
                    library.addMember(new Member(name, id, membershipType));
                    break;

                case 2: // Add Premium Member
                    System.out.print("Enter Premium Member Name: ");
                    String premiumName = scanner.nextLine();
                    System.out.print("Enter Premium Member ID: ");
                    int premiumId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Membership Type: ");
                    String premiumType = scanner.nextLine();
                    library.addPremiumMember(premiumName, premiumId, premiumType);
                    break;

                case 3: // Add Book
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Book ISBN: ");
                    String isbn = scanner.nextLine();
                    library.addBook(title, author, isbn);
                    break;

                case 4: // Borrow Book
                    System.out.print("Enter Member ID: ");
                    int memberIdBorrow = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Book Title: ");
                    String bookTitleBorrow = scanner.nextLine();
                    library.borrowBook(memberIdBorrow, bookTitleBorrow);
                    break;

                case 5: // Return Book
                    System.out.print("Enter Member ID: ");
                    int memberIdReturn = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Book Title: ");
                    String bookTitleReturn = scanner.nextLine();
                    library.returnBook(memberIdReturn, bookTitleReturn);
                    break;

                case 6: // Display Books
                    library.displayBooks();
                    break;

                case 7: // Display Members
                    library.displayMembers();
                    break;

                case 8: // Exit
                    scanner.close();
                    return;
            }
        }
    }
}
