package com.quest.oops.oops2;

public class BookCls {
    private String title;
    private String author;
    private String isbn;

    public BookCls(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}
