package com.quest.oops.test2;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Library {
    private List<Book> books;
    private LinkedList<BorrowRecord> borrowHistory;

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
        this.borrowHistory = new LinkedList<>();
    }


    public void addBook(Book book) {
        books.add(book);
    }


    public void borrowBook(String bookId, String borrower) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId) && book.isAvailable()) {

                Book borrowedBook = book.clone();
                book.setAvailable(false);
                BorrowRecord record = new BorrowRecord(borrowedBook, LocalDateTime.now(), borrower);
                borrowHistory.add(record);
                System.out.println("Book borrowed: " + borrowedBook.getTitle() + " by " + borrower);
                return;
            }
        }
        System.out.println("Book with ID " + bookId + " is either not available or not found.");
    }


    public void returnBook(String bookId) {
        for (BorrowRecord record : borrowHistory) {
            if (record.toString().contains(bookId) && record.toString().contains("Not Returned Yet")) {
                record.setReturnedAt(LocalDateTime.now());
                Book returnedBook = record.book;
                returnedBook.setAvailable(true);
                System.out.println("Book returned: " + returnedBook.getTitle());
                return;
            }
        }
        System.out.println("Book with ID " + bookId + " was not borrowed or already returned.");
    }


    public void listAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book);
            }
        }
    }

    public void viewBorrowHistory() {
        System.out.println("Borrow History:");
        for (BorrowRecord record : borrowHistory) {
            System.out.println(record);
        }
    }
}
