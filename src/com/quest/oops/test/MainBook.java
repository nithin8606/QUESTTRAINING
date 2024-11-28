package com.quest.oops.test;

import com.quest.oops.exceptionhandling.SpecialEditionBook;

import java.util.Scanner;

public class MainBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book[] books = {
                new Book("Java", "Yellow", 45.99, 10),
                new Book("Python for Beginners", "Red", 39.99, 5),
                new SpecialEditionBook("AI", "Brown", 59.99, 3, "Includes exclusive case studies"),
                new Book("Web Development", "White", 29.99, 20),
                new SpecialEditionBook("Blockchain", "Black", 49.99, 2, "Access to premium content")
        };

        while (true) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. View Book Inventory");
            System.out.println("2. Purchase a Book");
            System.out.println("3. Display Books Above Price Threshold");
            System.out.println("4. Add New Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:

                    System.out.println("\nBook Inventory:");
                    for (Book book : books) {
                        book.displayInfo();
                    }
                    break;

                case 2:
                    // Purchase books
                    System.out.println("\nPurchase books by entering details below:");
                    System.out.print("Enter the book title: ");
                    String bookTitle = scanner.nextLine();

                    System.out.print("Enter the quantity to purchase: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    boolean bookFound = false;
                    for (Book book : books) {
                        if (book.getTitle().equalsIgnoreCase(bookTitle)) {
                            bookFound = true;
                            try {

                                book.purchase(quantity);
                                System.out.println("Purchase successful! Remaining stock: " + book.getStock());
                            } catch (OutOfStockException e) {

                                System.out.println("Exception: " + e.getMessage());
                            }
                            break;
                        }
                    }

                    if (!bookFound) {
                        System.out.println("Book not found in the inventory.");
                    }
                    break;

                case 3:

                    System.out.print("\nEnter a price threshold to display books: ");
                    double priceThreshold = scanner.nextDouble();


                    System.out.println("\nBooks priced above $" + priceThreshold + ":");
                    for (Book book : books) {
                        if (book.getPrice() > priceThreshold) {
                            book.displayInfo();
                        }
                    }
                    break;

                case 4:

                    System.out.println("\nAdd a new book to the inventory:");

                    System.out.print("Enter book title: ");
                    String newBookTitle = scanner.nextLine();

                    System.out.print("Enter author name: ");
                    String newAuthor = scanner.nextLine();

                    System.out.print("Enter price: ");
                    double newPrice = scanner.nextDouble();

                    System.out.print("Enter stock quantity: ");
                    int newStock = scanner.nextInt();
                    scanner.nextLine();
                    Book newBook = new Book(newBookTitle, newAuthor, newPrice, newStock);


                    boolean isDuplicate = false;
                    for (Book book : books) {
                        if (book.getTitle().equalsIgnoreCase(newBook.getTitle()) &&
                                book.getAuthor().equalsIgnoreCase(newBook.getAuthor())) {
                            isDuplicate = true;
                            break;
                        }
                    }

                    if (isDuplicate) {
                        System.out.println("Error: Book with this title and author already exists.");
                    } else {

                        books = addBookToArray(books, newBook);
                        System.out.println("Book added successfully!");
                    }
                    break;

                case 5:

                    System.out.println("Exiting the program...");
                    scanner.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }


    public static Book[] addBookToArray(Book[] books, Book newBook) {
        Book[] newBooksArray = new Book[books.length + 1];
        System.arraycopy(books, 0, newBooksArray, 0, books.length);
        newBooksArray[books.length] = newBook;
        return newBooksArray;
    }
}
