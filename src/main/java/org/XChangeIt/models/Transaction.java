package org.XChangeIt.models;

import java.util.Date;

public class Transaction {
    private final Date transactionTime;
    private final String startingCurrency;
    private final String endingCurrency;
    private final double startingAmount;
    private final double endingAmount;
    private final double transactionFee;

    /**
     * Creates a new transaction object given the information about it.
     * The date is found when the transaction is instantiated
     * @param startingCurrency String representing the starting currency.
     * @param endingCurrency String representing the ending currency.
     * @param startingAmount Double representing the starting amount
     * @param endingAmount Double representing the ending amount.
     */
    public Transaction(String startingCurrency, String endingCurrency, double startingAmount, double endingAmount, double transactionFee){
        Date temp = new Date();                     //Creates a transaction time variable. This is done for when the transaction is started
        this.transactionTime = temp;                //Stores the current date in the transaction time
        this.startingCurrency = startingCurrency;   //Stores the starting currency of the transaction
        this.endingCurrency = endingCurrency;       //Stores the ending currency of the transaction
        this.startingAmount = startingAmount;       //Stores the starting amount that the user entered
        this.endingAmount = endingAmount;           //Stores the final amount to be returned to the user
        this.transactionFee = transactionFee;       //Stores the passed transaction fee into the transaction class
    }

    /**
     * Function to return the transaction time securely.
     * @return The transaction time as a date object.
     */
    public Date getTransactionTime() {
        return (Date) transactionTime.clone();
    }

    /**
     * Function to return the starting currency.
     * @return String representing starting currency.
     */
    public String getStartingCurrency() {
        return startingCurrency;
    }

    /**
     * Function to return the ending currency.
     * @return String representing ending currency.
     */
    public String getEndingCurrency() {
        return endingCurrency;
    }

    /**
     * Function to return the starting amount.
     * @return Double representing starting amount.
     */
    public double getStartingAmount() {
        return startingAmount;
    }

    /**
     * Function to return the ending amount.
     * @return Double representing ending amount.
     */
    public double getEndingAmount() {
        return endingAmount;
    }

    /**
     * Function to return the fee from the transaction.
     * @return Double representing the transaction fee.
     */
    public double getTransactionFee() {return transactionFee;}
}
