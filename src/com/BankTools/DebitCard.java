package com.BankTools;

import com.Bank.CheckingAccount;
import com.Bank.SavingsAccount;

import java.util.Calendar;
import java.util.List;

public class DebitCard {
    private String cardNum;
    private String pin;
    private Calendar expDate;
    private CheckingAccount primary;
    private List<SavingsAccount> atmAccounts;

    public DebitCard(String cardNum, String pin, CheckingAccount primary, List atmAccounts) {
        this.cardNum = cardNum;
        this.pin = pin;
        this.primary = primary;
        this.atmAccounts = atmAccounts;
    }

    public Boolean charge(int amount, String pin) {
        if (primary.getBalance() >= amount && this.pin == pin) {
            primary.withdraw(amount);
            return true;
        }
        return false;
    }

}