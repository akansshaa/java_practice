package com.examples.challengeInheritance;
 

public class book extends Library{
    private String ISBN;

    public book(String itemId, String title, String author, String ISBN) {
        super(itemId, title, author);
        this.ISBN = ISBN;
    }
    
    public String getISBN() {
        return ISBN;
    }

    public static void main(String[] args) {
        book book1 = new book("101", "abc", "xyz","12345");
        book1.getTitle();
        book1.checkOut();
        book1.returnItem();
    }
}
