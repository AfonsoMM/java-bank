package org.academiadecodigo.javabank.test;

import org.academiadecodigo.javabank.domain.Account;
import org.academiadecodigo.javabank.domain.AccountType;
import org.academiadecodigo.javabank.domain.Customer;

public class CustomerTest {

    public boolean test() {

        Customer customer = new Customer();

        // customer should start with zero balance
        if (customer.getBalance() != 0) {
            return false;
        }

        Account a1 = new Account(1, AccountType.CHECKING);
        Account a2 = new Account(2, AccountType.SAVINGS);
        a1.credit(100);
        a2.credit(120);

        // customer balance should equal sum of all accounts balance
        customer.addAccount(a1);
        customer.addAccount(a2);
        if (customer.getBalance() != 220) {
            return false;
        }

        // customer must keep a min balance on savings account
        customer.transfer(a2.getId(), a1.getId(), 30);
        if (a2.getBalance() != 120) {
            return false;
        }

        // customer must be able to perform transfers between accounts
        customer.transfer(a2.getId(), a1.getId(), 20);
        if (a2.getBalance() != 100 || a1.getBalance() != 120) {
            return false;
        }

        // customer can not withdraw from savings account
        customer.withdraw(2, 1);
        if (a2.getBalance() != 100) {
            return false;
        }

        return true;
    }
}