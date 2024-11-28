package com.quest.oops.test2;

public class MainBook {
    public static void main(String[] args) {

        Book book1 = new Book("B001", "Java Programming", "John Doe");
        Book book2 = new Book("B002", "Advanced Java", "Jane Smith");
        Book book3 = new Book("B003", "Data Structures", "Mark Lee");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.listAvailableBooks();

        library.borrowBook("B001", "Alice");
        library.borrowBook("B002", "Bob");

        library.listAvailableBooks();

        library.viewBorrowHistory();

        library.returnBook("B001");
        library.returnBook("B002");

        library.listAvailableBooks();

        library.viewBorrowHistory();
    }
}

//Shallow Copy
//
//Creates a new object and copies all fields to the new object.
//For non-primitive fields (like objects), only the references are copied, not the actual objects.
//Changes to the referenced objects in the clone affect the original object and vice versa.
//        Deep Copy
//
//Creates a new object and copies all fields, including duplicating objects referenced by the fields.
//Changes to the referenced objects in the clone do not affect the original object.
