package org.XChangeIt.models;

import java.util.ArrayList;
import java.util.Date;

public class TransactionList {
    private ArrayList<Transaction> transactionArrayList = new ArrayList<Transaction>();

    /**
     * Adds a transaction to the list, given the transaction object.
     * @param trans The Transaction object to be added to the list.
     */
    public void addTransaction(Transaction trans) {
        transactionArrayList.add(trans);
    }

    /**
     * Creates and adds a transaction to the list, given the transaction info.
     * @param transactionTime Date object containing the time of the transaction.
     * @param startingCurrency String representing the starting currency.
     * @param endingCurrency String representing the ending currency.
     * @param startingAmount Double representing the starting amount.
     * @param endingAmount Double representing the ending amount.
     */
    public void addNewTransaction(Date transactionTime, String startingCurrency, String endingCurrency, double startingAmount, double endingAmount) {
        Transaction newTrans = new Transaction(transactionTime, startingCurrency, endingCurrency, startingAmount, endingAmount);
        transactionArrayList.add(newTrans);
    }

    /**
     * Gets a transaction from the list by it's index.
     * @param i Index to get the transaction from
     * @return Transaction object from that location.
     */
    public Transaction getTransactionByIndex(int i) {
        return transactionArrayList.get(i);
    }
}
