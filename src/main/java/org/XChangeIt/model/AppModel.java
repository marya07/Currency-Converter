package org.XChangeIt.model;

import org.XChangeIt.translation.Translator;

import java.util.Date;

/**
 * Model class for storing all intermediate data required for the proper function of the program.
 */
public class AppModel {
    private final TransactionList transactionList = new TransactionList();  //Creates a new transaction list variable
    private final ReceiptList receiptList = new ReceiptList();
    private Transaction transaction;    //Transaction variable to hold the details of the transaction
    private Translator translator;      //Translator variable to hold the translation for the output
    private Receipt receipt;            //Receipt variable to hold the receipt

    /**
     * Function to initialize the transaction. and the receipt
     * @param date Date variable to hold the date of the transaction
     * @param startingAmount Money variable holding the details of the starting currency
     * @param endingAmount Money variable holding the details of the ending currency
     * @param fees Money variable holding the details of the fees
     */
    public void setTransaction(Date date, Money startingAmount, Money endingAmount, Money fees){
        transaction = new Transaction(date, startingAmount, endingAmount, fees);        // New transaction initialized
        transactionList.addTransaction(transaction);                            // Transaction added to the arraylist
        receipt = new Receipt(transaction, translator);                         // New Receipt initialized
        receiptList.addReceipt(receipt);                                        // Receipt added to the arraylist
    }

    /**
     * Function to get the translator
     * @return translator variable returned to show the translation for the receipt
     */
    public Translator getTranslator() {
        return translator;
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
        return receipt;
    }

    /**
     * Function to set the translator for the application
     * @param translator translator type for setting the local transactor to facilitate text translation.
     */
    public void setTranslator(Translator translator) {
            this.translator = translator;
    }

    /**
     *Function to get the transaction list
     * @return transactionList variable that holds the list of transactions
     */
    public TransactionList getTransactionList() {
        return transactionList;
    }

    /**
     * Function to get a list of receipts for all transactions for the session.
     * @return receiptList variable that holds n receipts.
     */
    public ReceiptList getReceiptList() {
        return receiptList;
    }
}