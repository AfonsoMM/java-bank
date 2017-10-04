package org.academiadecodigo.javabank.domain;

public abstract class Account {

    private double balance;
    private int id;
    private AccountType accountType;

    public Account(int id) {
        this.id = id;
    }

    public void credit(double amount) {
        balance += amount;
    }

    public boolean debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount){
        balance = amount;
    }

    public AccountType getAccountType(Account account) {
        if (account instanceof SavingsAccount){
            return AccountType.SAVINGS;}
        return AccountType.CHECKING;

}

    public int getId() {
        return id;
    }
}
