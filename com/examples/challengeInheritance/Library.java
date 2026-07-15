package com.examples.challengeInheritance;

public class Library {
    private String itemId;
    private String title;;
    private String author;

    Library(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    protected void checkOut(){
        System.out.println("Checking out item: "+title);
    }
    protected void returnItem(){
        System.out.println("Added the book to the Lobrary: "+title);
    }
}
