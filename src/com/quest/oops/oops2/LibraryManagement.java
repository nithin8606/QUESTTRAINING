package com.quest.oops.oops2;

public class LibraryManagement {
    private Book[] books;
    private Member[] members;
    private int bookCount;
    private int memberCount;

    public LibraryManagement() {
        this.books = new Book[50];  // Max 50 books
        this.members = new Member[20]; // Max 20 members
        this.bookCount = 0;
        this.memberCount = 0;
    }

    // Add a Premium Member
    public void addPremiumMember(String name, int id, String membershipType) {
        PremiumMember premiumMember = new PremiumMember(name, id, membershipType);
        addMember(premiumMember);  // Adding premium member via the existing method
    }

    // Add a Regular Member
    public void addMember(Member member) {
        if (findMemberById(member.getId()) == null && findMemberByName(member.getName()) == null) {
            if (memberCount < members.length) {
                members[memberCount++] = member;
                System.out.println("Member added: " + member.getName());
            }
        } else {
            System.out.println("Duplicate member detected. Cannot add member: " + member.getName());
        }
    }

    // Borrow Book Method (same as before)
    public void borrowBook(int memberId, String bookTitle) {
        Member member = findMemberById(memberId);
        Book book = findBookByTitle(bookTitle);

        if (member == null) {
            System.out.println("Member not found.");
        } else if (book == null) {
            System.out.println("Book not found.");
        } else {
            member.borrowBook(book);
        }
    }

    // Return Book Method (same as before)
    public void returnBook(int memberId, String bookTitle) {
        Member member = findMemberById(memberId);
        Book book = findBookByTitle(bookTitle);

        if (member == null) {
            System.out.println("Member not found.");
        } else if (book == null) {
            System.out.println("Book not found.");
        } else {
            member.returnBook(book);
        }
    }

    // Find a member by ID
    private Member findMemberById(int id) {
        for (int i = 0; i < memberCount; i++) {
            if (members[i].getId() == id) {
                return members[i];
            }
        }
        return null;
    }
    private Book findBookByIsbn(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                return books[i];
            }
        }
        return null;
    }
    // Find a member by Name
    private Member findMemberByName(String name) {
        for (int i = 0; i < memberCount; i++) {
            if (members[i].getName().equalsIgnoreCase(name)) {
                return members[i];
            }
        }
        return null;
    }

    // Find a book by Title
    private Book findBookByTitle(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    // Display all books in the library
    public void displayBooks() {
        System.out.println("Books in Library:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i]);
        }
    }

    // Display all members in the library
    public void displayMembers() {
        System.out.println("Library Members:");
        for (int i = 0; i < memberCount; i++) {
            System.out.println(members[i]);
        }
    }

    // Add Book method (same as before)
    public void addBook(String title, String author, String isbn) {
        if (findBookByIsbn(isbn) == null && findBookByTitle(title) == null) {
            if (bookCount < books.length) {
                books[bookCount++] = new Book(title, author, isbn);
                System.out.println("Book added: " + title);
            }
        } else {
            System.out.println("Duplicate book detected. Cannot add book: " + title);
        }
    }
}
