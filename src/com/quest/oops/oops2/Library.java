package com.quest.oops.oops2;
public class Library {
    private Book[] books;
    private LibraryMember[] members;

    public Library(int bookCapacity, int memberCapacity) {
        books = new Book[bookCapacity];
        members = new LibraryMember[memberCapacity];
    }
    public void addBook(String ISBN, String title, String author) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = new Book(ISBN, title, author);
                System.out.println("Book added: " + title);
                return;
            }
        }
        System.out.println("Library is full, cannot add more books.");
    }

    public void searchBook(String searchTerm) {
        boolean found = false;
        for (Book book : books) {
            if (book != null && (book.getTitle().contains(searchTerm) || book.getAuthor().contains(searchTerm) || book.getISBN().equals(searchTerm))) {
                book.displayBook();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Book not found.");
        }
    }

    // Borrow a book
    public void borrowBook(String ISBN) {
        for (Book book : books) {
            if (book != null && book.getISBN().equals(ISBN)) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Book borrowed: " + book.getTitle());
                    return;
                } else {
                    System.out.println("Book is not available.");
                    return;
                }
            }
        }
        System.out.println("Book not found.");
    }

    // Return a book
    public void returnBook(String ISBN) {
        for (Book book : books) {
            if (book != null && book.getISBN().equals(ISBN)) {
                if (!book.isAvailable()) {
                    book.setAvailable(true);
                    System.out.println("Book returned: " + book.getTitle());
                    return;
                } else {
                    System.out.println("This book was not borrowed.");
                    return;
                }
            }
        }
        System.out.println("Book not found.");
    }

    // Display available books
    public void displayAvailableBooks() {
        boolean found = false;
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book != null && book.isAvailable()) {
                book.displayBook();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No available books.");
        }
    }

    // Display all members
    public void displayAllMembers() {
        System.out.println("Library Members:");
        for (LibraryMember member : members) {
            if (member != null) {
                System.out.println("Member ID: " + member.getMemberId() + ", Name: " + member.getName() + ", Contact: " + member.getContactInfo());
            }
        }
    }

    // Add a member to the library
    public void addMember(String memberId, String name, String contactInfo) {
        for (int i = 0; i < members.length; i++) {
            if (members[i] == null) {
                members[i] = new LibraryMember(memberId, name, contactInfo);
                System.out.println("Member added: " + name);
                return;
            }
        }
        System.out.println("Library is full, cannot add more members.");
    }
}


