package org.academiadecodigo.javabank.view;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerSetInputScanner;
import org.academiadecodigo.javabank.application.Messages;
import org.academiadecodigo.javabank.controllers.Controller;
import org.academiadecodigo.javabank.controllers.LoginController;
import org.academiadecodigo.javabank.domain.Bank;

public class LoginView implements View{


    private Prompt prompt;
    private Bank bank;
    private LoginController controller;

    public LoginView(Prompt prompt, Bank bank, LoginController controller){
        this.prompt = prompt;
        this.bank = bank;
        this.controller = controller;
    }


    public void show() {

        IntegerSetInputScanner scanner = new IntegerSetInputScanner(bank.getCustomerIds());
        scanner.setMessage(Messages.CHOOSE_CUSTOMER);
        scanner.setError(Messages.ERROR_INVALID_CUSTOMER);
        controller.setCustomerId(prompt.getUserInput(scanner));


    }







}
