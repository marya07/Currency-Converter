package org.XChangeIt.model;

import java.util.ArrayList;
import java.util.Date;

public class TransactionList {
    private final ArrayList<Transaction> transactionArrayList = new ArrayList<Transaction>();

    public void addTransaction(Transaction transaction) {

        transactionArrayList.add(transaction);
    }

    public void addNewTransaction(Transaction transaction) {
        transactionArrayList.add(transaction);
    }


    /**
     * Gets a transaction from the list by it's index.
     *
     * @param i Index to get the transaction from
     * @return Transaction object from that location.
     */
    public Transaction getTransactionByIndex(int i) {
        return transactionArrayList.get(i);
    }

    public ArrayList<Transaction> getTransactionArrayList() {
        return transactionArrayList;
    }
}

