package com.avacallery.bank;

public class SavingsAccount extends BankAccount {

    // instead of const, we use static bc it does not change
    static int withdrawLimit = 5;
    private int withdrawCount;
    private int interest;
    // 2% will be stored as 2

    // because our parent account has a constructor, we need a constructor here
    // and we must use super to bring the attributes in
    public SavingsAccount(int balance, int accountNum, String owner){
        super(balance, accountNum, owner, "Savings");
        this.withdrawCount = 5;
        this.interest = interest;
    }

    public void applyInterest() {

    }


}
