package org.XChangeIt.model;

import org.XChangeIt.translation.Translator;

import java.util.Date;

public class AppModel {
    private final TransactionList transactionList = new TransactionList();
    private Transaction transaction;
    private Translator translator;
    private Receipt receipt;
    public Translator getTranslator() {
        return translator;
    }

    public void setTransaction(Date date, Money startingAmount, Money endingAmount, Money fees){
        transaction = new Transaction(date, startingAmount, endingAmount, fees);
        transactionList.addTransaction(transaction);
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

    public TransactionList getTransactionList() {
        return transactionList;
    }
}
