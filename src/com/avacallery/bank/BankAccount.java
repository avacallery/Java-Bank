package com.avacallery.bank;

public class BankAccount {

    // CLASS
    // private so we cannot get/set variables
    // for example, if balance was public, we can use . notation to change it when we make an instance:
    // // myAccount.balance = 10000000;
    // we cannot modify from an external class, but we CAN modify in the class it belongs to (BankAccount)
    // private is class scoped (only accessible by class), public is project scoped (accessible to whole project)

    protected int balance;
    // protected is inheritance/family scope
    private int accountNum;
    private String owner;
    private String type;

    // METHOD
    public BankAccount( int balance, int accountNum, String owner, String type) {
        // we use this. to access the CLASS attributes
        this.balance = balance;
        this.accountNum = accountNum;
        this.owner = owner;
        this.type = type;
    }

    // start with void unless you're sending something back
    // this is to deduct/adjust the balance, so not sending anything back
    public void withdraw(int amount) {
        balance -= amount;
    }

    public void deposit(int amount) {
        if (balance >= amount) {
            balance += amount;
        }
        return;
    }

    public String accountDetails() {
        // we use \ for escape and t for tab
         return  type + ": Owner: " + owner + "\tAccount Number: " + accountNum + "\tBalance: " + balance;
    }
}