package com.avacallery.bank;

public class CheckingAccount extends BankAccount {
    // because our parent account has a constructor, we need a constructor here
    public CheckingAccount(int balance, int accountNum, String owner){
        super(balance, accountNum, owner, "Checking");
    }

}
