package org.XChangeIt.model;

import java.util.Date;

public class Transaction {
    private final Date transactionTime;
    private final Money startingAmount;
    private final Money endingAmount;
    private final Money fees;


    public Transaction(Date transactionTime, Money startingAmount, Money endingAmount, Money fees) {
        this.transactionTime = transactionTime;
        this.startingAmount = startingAmount;
        this.endingAmount = endingAmount;
        this.fees = fees;
    }

    public Date getTransactionTime() {
        return transactionTime;
    }

    public Money getStartingAmount() {
        return startingAmount;
    }

    public Money getEndingAmount() {
        return endingAmount;
    }
    public Money getFees() {
        return this.fees;
    }

}
