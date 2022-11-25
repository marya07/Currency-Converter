package org.XChangeIt.model;

import org.XChangeIt.model.Money;
import org.XChangeIt.model.Receipt;
import org.XChangeIt.model.Transaction;
import org.XChangeIt.model.Translator;

import java.util.Date;

public class MainModel {
    private Transaction transaction;
    private Translator translator;
    private Receipt receipt;
    public Translator getTranslator() {
        return translator;
    }

    public void setTransaction(Date date, Money startingAmount, Money endingAmount, Money fees){
        transaction = new Transaction(date, startingAmount, endingAmount, fees);
        receipt = new Receipt(transaction, translator);
    }

    public Transaction getTransaction(){
        return this.transaction;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setTranslator(Translator translator) {
        this.translator = translator;
    }

}
