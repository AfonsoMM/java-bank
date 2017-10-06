package org.academiadecodigo.javabank.test;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerRangeInputScanner;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.javabank.actions.ChooseOperation;
import org.academiadecodigo.javabank.domain.Bank;
import org.academiadecodigo.javabank.domain.Customer;
import org.academiadecodigo.javabank.domain.account.AccountType;
import org.academiadecodigo.javabank.managers.AccountManager;

public class Test {

    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        Bank bank = new Bank(accountManager);

        LoadTestData loadData = new LoadTestData(accountManager, bank);

        bank = loadData.LoadData();

        Prompt prompt = new Prompt(System.in, System.out);
        IntegerRangeInputScanner scannerCustomerId = new IntegerRangeInputScanner(1,3);
        System.out.println("What's your ID: ");

        int customerId = prompt.getUserInput(scannerCustomerId);

        Customer activeCustomer = bank.getCustomer(customerId);

        String[] options = {"Create Account", "Deposit", "Withdraw", "Transfer", "Quit"};

        MenuInputScanner scannerMenu = new MenuInputScanner(options);
        scannerMenu.setMessage("Choose an option: ");

        int menuNum = prompt.getUserInput(scannerMenu);

        ChooseOperation choice = new ChooseOperation();
        choice.operate(activeCustomer, menuNum, accountManager);

















        /*CheckingAccountTest checkingAccountTest = new CheckingAccountTest();
        SavingsAccountTest savingsAccountTest = new SavingsAccountTest();
        AccountManagerTest accountManagerTest = new AccountManagerTest();
        CustomerTest customerTest = new CustomerTest();
        BankTest bankTest = new BankTest();

        System.out.println("CheckingAccount: " + (checkingAccountTest.test() ? "OK" : "FAIL"));
        System.out.println("SavingsAccount: " + (savingsAccountTest.test() ? "OK" : "FAIL"));
        System.out.println("AccountManager: " + (accountManagerTest.test() ? "OK" : "FAIL"));
        System.out.println("Customer: " + (customerTest.test() ? "OK" : "FAIL"));
        System.out.println("Bank: " + (bankTest.test() ? "OK" : "FAIL"));*/







    }


}
