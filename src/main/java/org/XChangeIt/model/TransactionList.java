package org.XChangeIt.model;

import java.util.ArrayList;

public class TransactionList {
    private final ArrayList<Transaction> transactionArrayList = new ArrayList<org.XChangeIt.model.Transaction>();   //Variable to hold the list of transactions

    /**
     * Function to add a transaction to the list
     * @param transaction variable that holds the data of the transaction to add
     */
    public void addTransaction(Transaction transaction) {

        transactionArrayList.add(transaction);      //Adds the transaction to the array list
    }

    /**
     * Gets a transaction from the list by it's index.
     * @param i Index to get the transaction from
     * @return Transaction object from that location.
     */
    public org.XChangeIt.model.Transaction getTransactionByIndex(int i) {
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

