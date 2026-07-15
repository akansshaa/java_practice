package com.examples.challenge101.challenge1;
public class bankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    public bankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    public static void main(String[] args) {
        bankAccount myAccount = new bankAccount("001111", "Akansha Mishra", 500000.00);
        myAccount.deposit(150000);
        myAccount.withdraw(100000);
        System.out.printf("hello %s,your account balance for your account number %s is: %.2f",myAccount.accountHolderName,myAccount.accountNumber,myAccount.balance);
    }
}

