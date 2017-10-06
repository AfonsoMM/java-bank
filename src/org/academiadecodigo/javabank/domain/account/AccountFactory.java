package org.academiadecodigo.javabank.domain.account;

public class AccountFactory {

    private Account newAccount;

    public void createAccount(AccountType accountType, int numberAccounts){

        if (accountType == AccountType.CHECKING) {
            newAccount = new CheckingAccount(numberAccounts);
        } else {
            newAccount = new SavingsAccount(numberAccounts);
        }
    }

    public Account getAccount() {
        return newAccount;
    }
}
