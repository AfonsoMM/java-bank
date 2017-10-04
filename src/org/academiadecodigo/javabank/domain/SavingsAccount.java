package org.academiadecodigo.javabank.domain;

public class SavingsAccount extends Account {


    public static final int MIN_SAVINGS_BALANCE = 100;

    public SavingsAccount(int id){
        super(id);
    }

    @Override
    public boolean debit(double amount) {

    if (getBalance() > MIN_SAVINGS_BALANCE + amount) {
        setBalance(getBalance() - amount);
        return true;
      }
      return false;
    }
}
