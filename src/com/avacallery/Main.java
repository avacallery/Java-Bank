package com.avacallery;

import com.avacallery.bank.BankAccount;
import com.avacallery.bank.CheckingAccount;
import com.avacallery.bank.SavingsAccount;

public class Main {

    public static void main(String[] args) {
        // create instance of BankAccount
        BankAccount myAccount = new BankAccount(1000, 1234567, "Ava", "Main Account");
        CheckingAccount myChecking = new CheckingAccount(2000, 123890, "Ava");
        SavingsAccount mySavings = new SavingsAccount(900, 6666, "Ava", 5);
        System.out.println(myChecking.accountDetails());
        System.out.println(mySavings.accountDetails());
        mySavings.applyInterest();
        System.out.println(mySavings.accountDetails());
    }

}
