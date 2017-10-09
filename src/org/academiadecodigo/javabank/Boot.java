package org.academiadecodigo.javabank;


import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.javabank.application.UserOptions;
import org.academiadecodigo.javabank.application.operations.BalanceOperation;
import org.academiadecodigo.javabank.application.operations.NewAccountOperation;
import org.academiadecodigo.javabank.application.operations.Operation;
import org.academiadecodigo.javabank.application.operations.transaction.DepositOperation;
import org.academiadecodigo.javabank.application.operations.transaction.WithdrawOperation;
import org.academiadecodigo.javabank.controllers.*;
import org.academiadecodigo.javabank.domain.Bank;
import org.academiadecodigo.javabank.view.BalanceView;
import org.academiadecodigo.javabank.view.LoginView;
import org.academiadecodigo.javabank.view.MenuView;
import org.academiadecodigo.javabank.view.View;

import java.util.HashMap;
import java.util.Map;

public class Boot {

    private Bank bank;

    public void initBoot(){



        LoginController loginController = new LoginController(bank);
        MenuController menuController = new MenuController(bank);
        BalanceController balanceController = new BalanceController(bank);
        WithdrawController withdrawController = new WithdrawController(bank);
        DepositController depositController = new DepositController(bank);
        NewAccountController newAccountController = new NewAccountController(bank);
        Prompt prompt = new Prompt(System.in, System.out);
        View loginView = new LoginView(prompt, bank, loginController);
        View menuView = new MenuView(prompt, bank, menuController);
        View balanceView = new BalanceView(prompt, bank, balanceController);
        loginController.setView(loginView);
        menuController.setView(menuView);

        loginController.setNextController(menuController);





        Map<Integer, Controller> mapControllers = buildControllerMap(balanceController, depositController, withdrawController, newAccountController);

        loginController.init();


    }

    public void setBank(Bank bank){
        this.bank = bank;
    }

    private Map<Integer, Controller> buildControllerMap(BalanceController balanceController, DepositController depositController, WithdrawController withdrawController, NewAccountController newAccountController) {

        Map<Integer, Controller> map = new HashMap<>();
        map.put(UserOptions.GET_BALANCE.getOption(), balanceController);
        map.put(UserOptions.DEPOSIT.getOption(), depositController);
        map.put(UserOptions.WITHDRAW.getOption(), withdrawController);
        map.put(UserOptions.OPEN_ACCOUNT.getOption(), newAccountController);

        return map;
    }

}
