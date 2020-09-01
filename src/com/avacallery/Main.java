package com.avacallery;

import com.avacallery.bank.BankAccount;
import com.avacallery.bank.CheckingAccount;
import com.avacallery.bank.SavingsAccount;

public class Main {

    public static void main(String[] args) {
        // create instance of BankAccount
        BankAccount myAccount = new BankAccount(1000, 1234567, "Ava", "Main Account");
        CheckingAccount myChecking = new CheckingAccount(2000, 123890, "Ava");
        SavingsAccount mySavings = new SavingsAccount(900, 6666, "Ava");
        System.out.println(myAccount.accountDetails());
        myAccount.deposit(50);
        System.out.println(myAccount.accountDetails());
        myAccount.withdraw(100);
        System.out.println(myAccount.accountDetails());
        System.out.println(myChecking.accountDetails());
        System.out.println(mySavings.accountDetails());

    }

}
