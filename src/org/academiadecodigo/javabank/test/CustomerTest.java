package org.academiadecodigo.javabank.test;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerInputScanner;
import org.academiadecodigo.javabank.domain.Customer;
import org.academiadecodigo.javabank.domain.account.AccountType;
import org.academiadecodigo.javabank.managers.AccountManager;

public class CustomerTest {

    public boolean test() {

        int customerId;

        AccountManager accountManager = new AccountManager();
        Customer customer1 = new Customer(1);
        customer1.setAccountManager(accountManager);

        Customer customer2 = new Customer(2);
        customer2.setAccountManager(accountManager);

        Customer customer3 = new Customer(3);
        customer3.setAccountManager(accountManager);


        /*// customer should start with zero balance
        if (customer.getBalance() != 0) {
            return false;
        }*/



        int a1 = customer1.openAccount(AccountType.CHECKING);
        int a2 = customer2.openAccount(AccountType.CHECKING);
        int a3 = customer3.openAccount(AccountType.CHECKING);
        accountManager.deposit(a1, 100);
        accountManager.deposit(a2, 120);
        accountManager.deposit(a3, 130);
        /*

        // customer balance should equal sum of all accounts balance
        if (customer.getBalance() != 220) {
            return false;
        }

        // customer should be able to get balance for its accounts
        if (customer.getBalance(a1) != 100 || customer.getBalance(a2) != 120) {
            return false;
        }*/

        return true;
    }
}
