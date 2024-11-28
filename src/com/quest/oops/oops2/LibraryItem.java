package com.quest.oops.oops2;

public interface LibraryItem {
    String getISBN();
    String getTitle();
    String getAuthor();
    boolean isAvailable();
    void setAvailable(boolean available);
    String toString();
}

