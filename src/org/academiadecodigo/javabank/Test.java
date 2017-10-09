package org.academiadecodigo.javabank;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.javabank.application.BankApplication;
import org.academiadecodigo.javabank.domain.Bank;
import org.academiadecodigo.javabank.domain.Customer;
import org.academiadecodigo.javabank.managers.AccountManager;

public class Test {

    public static void main(String[] args) {

        Boot boot = new Boot();
        Bank bank = new Bank();

        AccountManager accountManager = new AccountManager();
        bank.setAccountManager(accountManager);


        Customer c1 = new Customer(1,"Rui");
        Customer c2 = new Customer(2,"Sergio");
        Customer c3 = new Customer(3,"Bruno");
        bank.addCustomer(c1);
        bank.addCustomer(c2);
        bank.addCustomer(c3);

        boot.setBank(bank);
        boot.initBoot();


    }
}
