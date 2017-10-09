package org.academiadecodigo.javabank.controllers;

import org.academiadecodigo.javabank.domain.Bank;
import org.academiadecodigo.javabank.view.View;

public class BalanceController implements Controller {

    private Bank bank;
    private View view;

    public BalanceController(Bank bank){

        this.bank = bank;

    }

    public void init() {

        view.show();
    }

    public void setView(View view) {
        this.view = view;
    }


}
