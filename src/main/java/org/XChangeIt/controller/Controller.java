package org.XChangeIt.controller;

import org.XChangeIt.model.Money;
import org.XChangeIt.model.Receipt;
import org.XChangeIt.model.Transaction;

import java.util.Date;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class Controller {
    private Money currencyInput;
    private int state;
    private boolean cont;

    public Controller() {
        start();
    }

    private void start() {
        state = WELCOME;
        // Create the view.
        while(cont = TRUE) {
            switch(state) {
                case WELCOME:
                    welcome();
                case INPUT:
                    input();
                case RECEIPT:
                    receipt();
                case END:
                    end();
            }
        }
    }

    private void welcome() {
        // Run code to add welcome data to view.
        // Create a listener for the language buttons
            state = INPUT;
            // set language
        //
    }

    private void input() {
        // Run code to add input screen data to view.
        // Create a listener for the convert button
            // get input values, currencyType, amount,
            // if statement (if checkbox is checked)
                currencyInput = new Money(currencyType, amount);
                state = RECEIPT;
            // else
                // Show a dialogue saying they need to check the checkbox.
            //
        //
        // Create a listener for the back button
            state = WELCOME;
        //
        // Create a listener for the help button
            // Show a dialogue saying the help message.
        //
    }

    private void receipt() {
        // Run code to add receipt screen data to view.
        Converter currentConversion = new Converter(currencyInput);
        Transaction currentTransaction = new Transaction(new Date(), currencyInput.getCurrencyType(), currentConversion.doConvert().getCurrencyType(), currencyInput.getAmount(), currentConversion.doConvert().getAmount());
        Receipt currentReceipt = new Receipt(currentTransaction);
        // Set the main label to receipt text using the implementation Timothy I think made. Otherwise, just make receiptText public and use that.
        // Create a listener for the finish button
            state = END;
    }

    private void end() {
        // Run code to add end screen data to view.
        // Create listener for the yes button.
            state = WELCOME;
        // Create listener for the no button.
            cont = FALSE;
    }

    private static final int WELCOME = 0;
    private static final int INPUT = 1;
    private static final int RECEIPT = 2;
    private static final int END = 3;
}
