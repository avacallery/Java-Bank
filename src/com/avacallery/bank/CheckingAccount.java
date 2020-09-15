package com.avacallery.bank;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(int balance, int accountNum, String owner) {
        super(balance, accountNum, owner, "Checking");
    }
}
