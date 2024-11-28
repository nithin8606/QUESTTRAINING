package com.quest.oops.oops2;

public class Library implements LibraryOperation {
    private Book[] books;
    private LibraryMember[] members;
    private int bookCount;
    private int memberCount;

    public Library(int bookCapacity, int memberCapacity) {
        books = new Book[bookCapacity];
        members = new LibraryMember[memberCapacity];
        bookCount = 0;
        memberCount = 0;
    }

    @Override
    public void addBook(String ISBN, String title, String author) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getISBN().equals(ISBN)) {
                System.out.println("Book with ISBN " + ISBN + " already exists.");
                return;
            }
        }

        if (bookCount < books.length) {
            books[bookCount++] = new Book(ISBN, title, author);
            System.out.println("Book added: " + title);
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    @Override
    public void addMember(String memberId, String name, String contactInfo) {
        for (int i = 0; i < memberCount; i++) {
            if (members[i].getMemberId().equals(memberId)) {
                System.out.println("Member with ID " + memberId + " already exists.");
                return;
            }
        }

        if (memberCount < members.length) {
            members[memberCount++] = new LibraryMember(memberId, name, contactInfo);
            System.out.println("Member added: " + name);
        } else {
            System.out.println("Library membership is full.");
        }
    }

    @Override
    public void borrowBook(String ISBN) {
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getISBN().equals(ISBN) && !books[i].isBorrowed()) {
                books[i].setBorrowed(true);
                System.out.println("You have successfully borrowed: " + books[i].getTitle());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Sorry, the book with ISBN " + ISBN + " is either not found or already borrowed.");
        }
    }

    @Override
    public void returnBook(String ISBN) {
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getISBN().equals(ISBN) && books[i].isBorrowed()) {
                books[i].setBorrowed(false);
                System.out.println("You have successfully returned: " + books[i].getTitle());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Sorry, the book with ISBN " + ISBN + " was not found or wasn't borrowed.");
        }
    }

    public void searchBook(String searchTerm) {
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().contains(searchTerm) ||
                    books[i].getAuthor().contains(searchTerm) ||
                    books[i].getISBN().equals(searchTerm)) {

                System.out.println(books[i].toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found matching the search term: " + searchTerm);
        }
    }

    public void displayAvailableBooks() {
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (!books[i].isBorrowed()) {
                System.out.println(books[i].toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No available books at the moment.");
        }
    }

    public void displayAllMembers() {
        if (memberCount == 0) {
            System.out.println("No members registered.");
        } else {
            for (int i = 0; i < memberCount; i++) {
                System.out.println(members[i].toString());
            }
        }
    }
}
