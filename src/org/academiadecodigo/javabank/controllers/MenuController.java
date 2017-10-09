package org.academiadecodigo.javabank.controllers;

import org.academiadecodigo.javabank.domain.Bank;
import org.academiadecodigo.javabank.view.View;

import java.util.Map;

public class MenuController implements Controller{

    private View view;
    private Bank bank;
    private Controller nextController;
    private  Map<Integer, Controller> map;

    public MenuController(Bank bank){
        this.bank = bank;
    }

    public void init(){

        view.show();

    }

    public void setUserOption(int menuOption){
        System.out.println(menuOption);
        map.get(menuOption).init();


    }

    public void setView(View view){

        this.view = view;

    }

    public void setMap(Map<Integer, Controller> map) {
        this.map = map;
    }
}
