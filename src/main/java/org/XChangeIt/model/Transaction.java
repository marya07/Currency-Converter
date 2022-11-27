package org.XChangeIt.model;

import java.util.Date;

public class Transaction {
    private final Date transactionTime;     //Variable holding the date of the transaction
    private final Money startingAmount;     //Variable holding the starting amount and its details
    private final Money endingAmount;       //Variable holding the ending amount and its details
    private final Money fees;               //Variable holding the fees and its details

    /**
     * Constructor function to create an instance of the transaction class. Class contains the transaction time
     * the starting amount, ending amount, and the fees charged
     * @param transactionTime Variable getting the transaction time
     * @param startingAmount variable to hold the starting amount and its details
     * @param endingAmount variable to hold the ending amount and its details
     * @param fees variable to hold the fees from the transaction
     */
    public Transaction(Date transactionTime, Money startingAmount, Money endingAmount, Money fees) {
        this.transactionTime = transactionTime;     //Stores the transaction time
        this.startingAmount = startingAmount;       //Stores the starting amount
        this.endingAmount = endingAmount;           //Stores the ending amount
        this.fees = fees;                           //Stores the fees charged
    }

    /**
     * Function to return the transaction time of the transaction
     * @return transactionTime
     */
    public Date getTransactionTime() {
        return transactionTime;
    }

    /**
     * Function to return the starting amount of the currency
     * @return startingAmount
     */
    public Money getStartingAmount() {
        return startingAmount;
    }

    /**
     * Function to return the ending amount of the currency
     * @return endingAmount
     */
    public Money getEndingAmount() {
        return endingAmount;
    }

    /**
     * Function to return the fees of the transaction
     * @return fees
     */
    public Money getFees() {
        return this.fees;
    }

}
