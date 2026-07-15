package com.examples.challenge101.challenge1;

public class user {
    public static void main(String[] args) {
        bankAccount myAccount = new bankAccount("002222", "John Doe", 300000.00);
        myAccount.deposit(50000);
        myAccount.withdraw(20000);

    }
}
