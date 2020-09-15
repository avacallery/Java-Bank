package com.avacallery.bank.Bank;

import com.avacallery.bank.Bank.BankAccount;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(int balance, int accountNum, String owner) {
        super(balance, accountNum, owner, "Checking");
    }
}
