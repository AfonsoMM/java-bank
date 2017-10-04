package org.academiadecodigo.javabank.test;

import org.academiadecodigo.javabank.domain.*;

public class BankTest {

    public boolean test() {

        Bank bank = new Bank();

        // bank initial balance should be 0
        if (bank.getBalance() != 0) {
            return false;
        }

        CheckingsAccount a1 = new CheckingsAccount(1);
        CheckingsAccount a2 = new CheckingsAccount(2);
        CheckingsAccount a3 = new CheckingsAccount(3);
        CheckingsAccount a4 = new CheckingsAccount(4);

        a1.credit(10);
        a2.credit(10);
        a3.credit(10);
        a4.credit(10);

        Customer c1 = new Customer();
        Customer c2 = new Customer();

        c1.addAccount(a1);
        c1.addAccount(a2);
        c2.addAccount(a3);
        c2.addAccount(a4);

        bank.addCustomer(c1);
        bank.addCustomer(c2);

        // bank balance should equal sum of all accounts
        if (bank.getBalance() != 40) {
            return false;
        }

        return true;
    }
}
