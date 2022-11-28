package org.XChangeIt.model;

import java.util.ArrayList;

/**
 * Class for storing all the processed transactions data for the current session.
 */
public class TransactionList {
    private final ArrayList<Transaction> transactionArrayList = new ArrayList<Transaction>();   //Variable to hold the list of transactions

    /**
     * Function to add a transaction to the list
     * @param transaction variable that holds the data of the transaction to add
     */
    public void addTransaction(Transaction transaction) {

        transactionArrayList.add(transaction);
    }

    /**
     * Gets a transaction from the list by it's index.
     * @param i Index to get the transaction from
     * @return Transaction object from that location.
     */
    public Transaction getTransactionByIndex(int i) {
        return transactionArrayList.get(i);
    }

    /**
     * Function to return the list of array transactions
     * @return transactionArrayList variable that holds the list of transactions
     */
    public ArrayList<Transaction> getTransactionArrayList() {
        return transactionArrayList;
    }

}

