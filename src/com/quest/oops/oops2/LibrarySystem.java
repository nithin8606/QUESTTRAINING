package com.quest.oops.oops2;

import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library(5, 3);

        // Add some initial books and members
        library.addBook("111", "Java Programming", "Krish");
        library.addBook("222", "Inter Java", "David");
        library.addBook("333", "Advanced Java", "Ashiq");

        library.addMember("M1", "Nithin", "nithin@example.com");
        library.addMember("M2", "Krishna", "krishna@example.com");

        // Main loop for the library system
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Display Available Books");
            System.out.println("2. Search for a Book");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Display All Members");
            System.out.println("6. Add a New Book");
            System.out.println("7. Add a New Member");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine()); // Read choice and handle invalid input
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    library.displayAvailableBooks();
                    break;
                case 2:
                    System.out.print("Enter book title, author, or ISBN to search: ");
                    String searchTerm = scanner.nextLine();
                    library.searchBook(searchTerm);
                    break;
                case 3:
                    System.out.print("Enter ISBN of the book to borrow: ");
                    String borrowISBN = scanner.nextLine();
                    library.borrowBook(borrowISBN);
                    break;
                case 4:
                    System.out.print("Enter ISBN of the book to return: ");
                    String returnISBN = scanner.nextLine();
                    library.returnBook(returnISBN);
                    break;
                case 5:
                    library.displayAllMembers();
                    break;
                case 6:
                    System.out.println("Enter details of the new book:");
                    System.out.print("ISBN: ");
                    String ISBN = scanner.nextLine();
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Author: ");
                    String author = scanner.nextLine();
                    library.addBook(ISBN, title, author);
                    break;
                case 7:
                    System.out.println("Enter details of the new member:");
                    System.out.print("Member ID: ");
                    String memberId = scanner.nextLine();
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Contact Info: ");
                    String contactInfo = scanner.nextLine();
                    library.addMember(memberId, name, contactInfo);
                    break;
                case 8:
                    System.out.println("Exiting the system.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
