package com.avacallery.bank.Bank;

public class BankAccount {
    protected int balance;
    private int accountNum;
    private String owner;
    private String type;

    public BankAccount(int balance, int accountNum, String owner, String type) {
        this.balance = balance;
        this.accountNum = accountNum;
        this.owner = owner;
        this.type = type;
    }

    public void withdraw(int amount) {
        this.balance -= amount;
    }

    public void deposit(int amount) {
        if (this.balance >= amount) {
            this.balance += amount;
        }

    }

    public String accountDetails() {
        return this.type + ": Owner: " + this.owner + "\tAccount Number: " + this.accountNum + "\tBalance: " + this.balance;
    }

    public int getBalance() {
        return balance;
    }
}
