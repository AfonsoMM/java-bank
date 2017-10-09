package org.academiadecodigo.javabank.view;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.javabank.controllers.BalanceController;
import org.academiadecodigo.javabank.domain.Bank;

public class BalanceView implements View{

    private Prompt prompt;
    private BalanceController controller;
    private Bank bank;

    public BalanceView(Prompt prompt, Bank bank, BalanceController controller){

        this.prompt = prompt;
        this.controller = controller;
        this.bank = bank;
    }

    public void show(){

        System.out.println("Bom dia");

    }

}
