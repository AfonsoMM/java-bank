package org.academiadecodigo.javabank.domain;

import java.util.HashMap;
import java.util.Map;

public class Customer {

    private Map<Integer, Account> accounts = new HashMap<>();

    public void addAccount(Account account) {
        accounts.put(account.getId(), account);
    }

    /*public void deleteAccount(int deleteid, int moneyid) {
        transfer(deleteid, moneyid, accounts.get(deleteid).getBalance());
        accounts.remove(accounts.get(deleteid));

    }*/



    public double getBalance(int id) {
        return accounts.get(id).getBalance();
    }

    public double getBalance() {

        double balance = 0;

        for (Account account : accounts.values()) {
            balance += account.getBalance();
        }

        return balance;
    }

    public void deposit(int id, double amount) {
        accounts.get(id).credit(amount);
    }

    public void withdraw(int id, double amount) {

        Account account = accounts.get(id);

        if(account.getAccountType(account) != AccountType.SAVINGS) {
            account.debit(amount);
        }

    }

    public void transfer(int srcId, int destId, double amount) {

        Account srcAccount = accounts.get(srcId);
        Account dstAccount = accounts.get(destId);

        boolean debitDone = srcAccount.debit(amount);
        if (debitDone) {
            dstAccount.credit(amount);
        }

    }

}
