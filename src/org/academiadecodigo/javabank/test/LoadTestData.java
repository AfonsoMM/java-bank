package org.academiadecodigo.javabank.test;

import org.academiadecodigo.javabank.domain.Bank;
import org.academiadecodigo.javabank.domain.Customer;
import org.academiadecodigo.javabank.managers.AccountManager;

public class LoadTestData {

    AccountManager accountManager = new AccountManager();
    Bank bank = new Bank(accountManager);


    public LoadTestData(AccountManager accountManager, Bank bank){
        this.accountManager = accountManager;
        this.bank = bank;
    }

    public Bank LoadData(){

        Customer customer1 = new Customer(1);
        customer1.setAccountManager(accountManager);
        bank.addCustomer(customer1);

        Customer customer2 = new Customer(2);
        customer2.setAccountManager(accountManager);
        bank.addCustomer(customer2);

        Customer customer3 = new Customer(3);
        customer3.setAccountManager(accountManager);
        bank.addCustomer(customer3);

        return bank;

    }


}
