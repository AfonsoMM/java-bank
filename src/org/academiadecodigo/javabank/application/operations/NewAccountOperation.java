package org.academiadecodigo.javabank.controllers.operations;

import org.academiadecodigo.javabank.view.BankApplication;
import org.academiadecodigo.javabank.utils.Messages;
import org.academiadecodigo.javabank.models.account.AccountType;

public class NewAccountOperation extends AbstractBankOperation {

    public NewAccountOperation(BankApplication bankApplication) {
        super(bankApplication);
    }

    @Override
    public void execute() {

        int accountId = customer.openAccount(AccountType.CHECKING);

        System.out.println("\n" + Messages.CREATED_ACCOUNT + customer.getName() + " : " + accountId);

    }
}
