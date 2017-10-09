package org.academiadecodigo.javabank.controllers;

import org.academiadecodigo.javabank.domain.Bank;
import org.academiadecodigo.javabank.view.View;

public class NewAccountController implements Controller{

    private Bank bank;
    private View view;

    public NewAccountController(Bank bank){

        this.bank = bank;

    }

    public void init() {

    }

    public void setView(View view) {
        this.view = view;
    }


}
