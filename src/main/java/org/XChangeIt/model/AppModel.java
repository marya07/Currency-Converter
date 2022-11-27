package org.XChangeIt.model;

import org.XChangeIt.Profits;
import org.XChangeIt.translation.Translator;

import java.util.Date;

public class AppModel {
    private final TransactionList transactionList = new TransactionList();  //Creates a new transaction list variable
    private final ReceiptList receiptList = new ReceiptList();
    private Transaction transaction;    //Transaction variable to hold the details of the transaction
    private Translator translator;      //Translator variable to hold the translation for the output
    private Receipt receipt;            //Receipt variable to hold the receipt
    private Profits profits;
    /**
     * Function to get the translator
     * @return translator Translator variable returned to show the translation for the receipt
     */
    public Translator getTranslator() {
        return translator;
    }

    /**
     * Function to initialize the transaction. and the receipt
     * @param date Date variable to hold the date of the transaction
     * @param startingAmount Money variable holding the details of the starting currency
     * @param endingAmount Money variable holding the details of the ending currency
     * @param fees Money variable holding the details of the fees
     */
    public void setTransaction(Date date, Money startingAmount, Money endingAmount, Money fees){
        transaction = new Transaction(date, startingAmount, endingAmount, fees);        //Creates a transaction based on the date, starting amount, ending amount, and the fees
        transactionList.addTransaction(transaction);        //Adds the transaction to the list
        receipt = new Receipt(transaction, translator);     //Creates a new receipt based on the transaction and the translator
        receiptList.addReceipt(receipt);
        this.profits = new Profits();
    }

    /**
     * Function to return the transaction
     * @return transaction
     */
    public Transaction getTransaction(){
        return this.transaction;
    }

    /**
     * Function to return the receipt object
     * @return receipt
     */
    public Receipt getReceipt() {
        return receipt;                         //Returns the receipt object
    }

    /**
     * Function to set the translator for the application
     * @param translator
     */
    public void setTranslator(Translator translator) {
            this.translator = translator;       //Stores the translator
    }

    /**
     *Function to get the transaction list
     * @return transactionList TransactionList variable that holds the list of transactions
     */
    public TransactionList getTransactionList() {
        return transactionList;                 //Returns the transaction list
    }

    public ReceiptList getReceiptList() {
        return receiptList;
    }
}