package com.Accounts;

public class CDInvestment extends InvestmentAccount {
    private int timeFrame;
    private char timePeriod; //D = day, W = week, M = month, Q = quarter, Y = year

    public CDInvestment(int balance, int accountNum, String owner, int interestRate, int timeFrame, char timePeriod) {
        super(balance, accountNum, owner, interestRate);
        this.timeFrame = timeFrame;
        this.timePeriod = timePeriod;
    }

    public void checkIfInterest(int time) {
        if (time >= timeFrame && balance > 0) {
            applyInterest();
        }
    }

    @Override
    public void withdraw(int amount) {
        return;
    }
}
