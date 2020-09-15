package com.avacallery.bank;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(1000, 1234567, "Ava", "Main Account");
        new CheckingAccount(2000, 123890, "Ava");
        SavingsAccount mySavings = new SavingsAccount(900, 6666, "Ava", 5);
        mySavings.withdraw(200);
        mySavings.deposit(55);
        mySavings.applyInterest();
        System.out.println(myAccount.accountDetails());
        myAccount.deposit(50);
        System.out.println(myAccount.accountDetails());
        myAccount.withdraw(100);
        System.out.println(myAccount.accountDetails());
        System.out.println(mySavings.accountDetails());
    }
}