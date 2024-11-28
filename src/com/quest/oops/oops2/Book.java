package com.quest.oops.oops2;

public class Book implements LibraryItem {
    private String ISBN;
    private String title;
    private String author;
    private boolean available;
    private boolean borrowed;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.available = true;
        this.borrowed = false;
    }

    @Override
    public String getISBN() {
        return ISBN;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public boolean isAvailable() {
        // If borrowed, it is not available
        return available && !borrowed;
    }

    @Override
    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Getter and Setter for borrowed status
    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book [ISBN=" + ISBN + ", Title=" + title + ", Author=" + author +
                ", Available=" + available + ", Borrowed=" + borrowed + "]";
    }

    public String getIsbn() {
        return ISBN;

    }
}
