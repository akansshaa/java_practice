package com.examples.challengeInheritance;

public class Magazine extends Library{
    
    private int issueNumber;

    public Magazine(String itemId, String title, String author, int issueNumber) {
        super(itemId, title, author);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }
    public static void main(String[] args) {
        Magazine mag1 = new Magazine("201", "Tech Today", "John Doe", 45);
        mag1.getTitle();
        mag1.checkOut();
    }
}
