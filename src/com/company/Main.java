package com.company;

import com.Accounts.CDInvestment;
import com.Accounts.InvestmentAccount;
import com.Bank.Client;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
    CDInvestment myCD = new CDInvestment(10000, 192840, "Ava", 10, 2, 'Y'
    );
    InvestmentAccount invAcct = new InvestmentAccount(20000, 2048192, "Jake", 5);

        System.out.println(myCD.accountDetails());
        myCD.withdraw(200);
        System.out.println(myCD.accountDetails());
        System.out.println(invAcct.accountDetails());
        invAcct.withdraw(500);
        System.out.println(invAcct.accountDetails());

        Client ava = new Client("Ava", "Callery", "1234");
//        ava.addAccount(myAcct);
//        ava.addAccount(mySavings);

    }
}