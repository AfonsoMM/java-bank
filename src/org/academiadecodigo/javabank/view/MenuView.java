package org.academiadecodigo.javabank.view;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.javabank.application.Messages;
import org.academiadecodigo.javabank.application.UserOptions;
import org.academiadecodigo.javabank.controllers.Controller;
import org.academiadecodigo.javabank.controllers.MenuController;
import org.academiadecodigo.javabank.domain.Bank;
import org.academiadecodigo.javabank.domain.Customer;

public class MenuView implements View{

    private Bank bank;
    private MenuController controller;
    private Prompt prompt;

    public MenuView(Prompt prompt, Bank bank, MenuController controller){

        this.prompt = prompt;
        this.controller = controller;
        this.bank = bank;

    }

    public void show(){

        MenuInputScanner mainMenu = new MenuInputScanner(UserOptions.getMessages());
        mainMenu.setError(Messages.ERROR_INVALID_OPTION);
        mainMenu.setMessage(Messages.MENU_WELCOME);
        controller.setUserOption(prompt.getUserInput(mainMenu));
    }

}
