package com.quest.oops.oops2;

public class Member implements OperationCls {
    private String name;
    private int id;
    private String membershipType;
    private Book borrowedBook;

    public Member(String name, int id, String membershipType) {
        this.name = name;
        this.id = id;
        this.membershipType = membershipType;
        this.borrowedBook = null;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(Book borrowedBook) {
        this.borrowedBook = borrowedBook;
    }

    @Override
    public void borrowBook(Book book) {
        if (borrowedBook == null) {
            borrowedBook = book;
            System.out.println(name + " borrowed: " + book.getTitle());
        } else {
            System.out.println(name + " already has a borrowed book.");
        }
    }

    @Override
    public void returnBook(Book book) {
        if (borrowedBook != null && borrowedBook.getTitle().equals(book.getTitle())) {
            System.out.println(name + " returned: " + book.getTitle());
            borrowedBook = null;
        } else {
            System.out.println(name + " has no such book borrowed.");
        }
    }

    @Override
    public String toString() {
        return "Member Name: " + name + ", ID: " + id + ", Membership Type: " + membershipType;
    }
}
