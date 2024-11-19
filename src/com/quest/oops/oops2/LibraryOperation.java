package com.quest.oops.oops2;

abstract class LibraryOperation {
    // Abstract methods for basic operations
    abstract void addBook(String isbn, String title, String author);
    abstract void borrowBook(String memberId, String isbn);
    abstract void returnBook(String memberId, String isbn);
    abstract void displayAvailableBooks();
    abstract void searchBook(String searchTerm);
    abstract void displayAllMembers();
}

