package org.academiadecodigo.javabank.controllers;

import org.academiadecodigo.javabank.domain.Customer;
import org.academiadecodigo.javabank.domain.Bank;
import org.academiadecodigo.javabank.view.LoginView;
import org.academiadecodigo.javabank.view.MenuView;
import org.academiadecodigo.javabank.view.View;

public class LoginController implements Controller{


    private View view;
    private Bank bank;
    private Controller nextController;

    public LoginController(Bank bank) {
        this.bank = bank;

    }

    public void init() {
        view.show();
    }

    public void setCustomerId(int costumerId) {
        bank.setAccessingCustomer(costumerId);
        nextController.init();
    }

    public void setView(View view){
        this.view = view;
    }

    public void setNextController(Controller controller){
        this.nextController = controller;
    }

}
