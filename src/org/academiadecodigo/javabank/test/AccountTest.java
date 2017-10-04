package org.academiadecodigo.javabank.test;

import org.academiadecodigo.javabank.domain.Account;
import org.academiadecodigo.javabank.domain.AccountType;
import org.academiadecodigo.javabank.domain.CheckingsAccount;
import org.academiadecodigo.javabank.domain.SavingsAccount;

public class AccountTest {

    public boolean test() {

        //CheckingsAccount account = new CheckingsAccount(1);
        SavingsAccount account = new SavingsAccount(1);

        // account should start with zero money
        if (account.getBalance() != 0) {
            return false;
        }

        // we should be able to deposit money in account
        account.credit(160);
        if (account.getBalance() != 160) {
            return false;
        }

        // we should be able to take money from account
        account.debit(40);
        if (account.getBalance() != 120) {

            return  false;
        }

        return true;
    }

}
