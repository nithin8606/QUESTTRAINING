package com.quest.oops.test2;

import java.time.LocalDateTime;

public class Book implements Cloneable {
    private String bookId;
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor
    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }


    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }


    public void setAvailable(boolean available) {
        isAvailable = available;
    }


    @Override
    public Book clone() {
        try {
            Book clonedBook = (Book) super.clone();
            return clonedBook;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "BookID: " + bookId + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable;
    }
}

