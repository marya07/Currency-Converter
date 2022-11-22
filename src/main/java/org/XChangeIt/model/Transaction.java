package org.XChangeIt.model;

import java.util.Date;

public class Transaction {
    private final Date transactionTime;
    private final String startingCurrency;
    private final String endingCurrency;
    private final double startingAmount;
    private final double endingAmount;

    /**
     * Creates a new transaction object given the information about it.
     * @param transactionTime Date object representing the time of the transaction.
     * @param startingCurrency String representing the starting currency.
     * @param endingCurrency String representing the ending currency.
     * @param startingAmount Double representing the starting amount
     * @param endingAmount Double representing the ending amount.
     */
    public Transaction(Date transactionTime, String startingCurrency, String endingCurrency, double startingAmount, double endingAmount) {
        this.transactionTime = transactionTime;
        this.startingCurrency = startingCurrency;
        this.endingCurrency = endingCurrency;
        this.startingAmount = startingAmount;
        this.endingAmount = endingAmount;
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
}
