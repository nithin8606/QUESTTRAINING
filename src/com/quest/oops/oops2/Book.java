package com.quest.oops.oops2;

public class Book {
    private String ISBN;
    private String title;
    private String author;
    private boolean available;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Display book details
    public void displayBook() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + author + ", Available: " + (available ? "Yes" : "No"));
    }
}

    
