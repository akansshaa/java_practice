package com.examples.challenge101;
class Book {
    static int totalBooks;
    String title,author;
    int isbn;
    boolean isBorrowed;
    static{
        totalBooks = 0;
    }
    {//object init
        totalBooks++;
    }
    Book(String title,String author,int isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    Book(int isbn){
        this("unknown","unknown",isbn);
    }
    static int getTotalBooks(){
        return totalBooks;
    }
    void borrowBook(){
        if(isBorrowed){
            System.out.println("Not Available currently.");
        }else{
            isBorrowed = true;
            System.out.println("Borrowed successfully.");
            totalBooks--;
        }
    }
    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Thank You!Visit Again.");
            totalBooks++;
        }else{
            System.out.println("book is in the library.");
        }
    }
    public static void main(String[] args) {
        Book faultInOurStar = new Book(122567);
        Book bb2 = new Book("fiction","author",122568);
        System.out.print("total books in the library: " + getTotalBooks());
        bb2.borrowBook();
        faultInOurStar.borrowBook();
        faultInOurStar.returnBook();
        System.out.println(Book.getTotalBooks());
    }
}
