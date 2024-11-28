package com.quest.oops.oops2;

public class PremiumMember extends Member {

    public PremiumMember(String name, int id, String membershipType) {
        super(name, id, membershipType);
    }

    // Override borrowBook method to allow borrowing multiple books
    @Override
    public void borrowBook(Book book) {
        if (getBorrowedBook() == null) {
            setBorrowedBook(book);
            System.out.println(getName() + " borrowed: " + book.getTitle());
        } else {
            System.out.println(getName() + " can borrow more than one book, current book: " + getBorrowedBook().getTitle());
            // You can implement logic here for borrowing additional books if needed
        }
    }

    // You may also implement other unique premium features here

}
