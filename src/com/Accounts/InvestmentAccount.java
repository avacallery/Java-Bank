package com.Accounts;

public class InvestmentAccount extends BankAccount {
    private int interestRate = 5;
    private int period = 1;
    private char periodType = 'Q'; //D = day, W = week, M = month, Q = quarter, Y = year
    private int withdrawFee = 1000;

    public InvestmentAccount(
            int balance,
            int accountNum,
            String owner,
            int interestRate) {
        // use super to call the parent class
        super(balance, accountNum, owner, "Investment");
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        deposit((int)(balance + (balance * (interestRate / 100.0))));
    }

    @Override
    public void withdraw(int amount) {
        super.withdraw(amount + withdrawFee);
    }
}
