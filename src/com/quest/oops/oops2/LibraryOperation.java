package com.quest.oops.oops2;

public interface LibraryOperation {
    void addBook(String ISBN, String title, String author);
    void addMember(String memberId, String name, String contactInfo);
    void displayAvailableBooks();
    void borrowBook(String ISBN);
    void returnBook(String ISBN);
    void displayAllMembers();
}

