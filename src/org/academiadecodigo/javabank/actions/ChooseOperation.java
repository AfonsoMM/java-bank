package org.academiadecodigo.javabank.actions;


import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerInputScanner;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerRangeInputScanner;
import org.academiadecodigo.javabank.domain.Customer;
import org.academiadecodigo.javabank.managers.AccountManager;

public class ChooseOperation {

    private Customer customer;
    Prompt prompt = new Prompt(System.in, System.out);


    public void operate(Customer customer, int menuId, AccountManager accountManager){

        switch(menuId){
            case 1:

            case 2:

                IntegerInputScanner scanner1 = new IntegerInputScanner();
                System.out.println("What's your Account ID: ");
                int accountId = prompt.getUserInput(scanner1);

                IntegerInputScanner scanner2 = new IntegerInputScanner();
                System.out.println("Amount: ");
                int amount = prompt.getUserInput(scanner2);


            case 3:

            case 4:

            case 5:
        }
    }

}
