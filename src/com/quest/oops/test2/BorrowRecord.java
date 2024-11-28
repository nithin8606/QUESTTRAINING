package com.quest.oops.test2;

import java.time.LocalDateTime;

public class BorrowRecord {
    public Book book;
    private LocalDateTime borrowedAt;
    private LocalDateTime returnedAt;
    private String borrowedBy;

    // Constructor
    public BorrowRecord(Book book, LocalDateTime borrowedAt, String borrowedBy) {
        this.book = book;
        this.borrowedAt = borrowedAt;
        this.borrowedBy = borrowedBy;
        this.returnedAt = null;
    }

    // Setter for returnedAt
    public void setReturnedAt(LocalDateTime returnedAt) {
        this.returnedAt = returnedAt;
    }

    @Override
    public String toString() {
        return "Book: " + book.getTitle() + ", Borrowed By: " + borrowedBy +
                ", Borrowed At: " + borrowedAt +
                (returnedAt != null ? ", Returned At: " + returnedAt : ", Not Returned Yet");
    }
}

