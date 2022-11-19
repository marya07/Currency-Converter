package org.XChangeIt.models;

import java.util.ArrayList;
import java.util.Date;

public class TransactionList {
    private final ArrayList<Transaction> transactionArrayList = new ArrayList<Transaction>();

    /**
     * Adds a transaction to the list, given the transaction object.
     * @param trans The Transaction object to be added to the list.
     */
    public void addTransaction(Transaction trans) {
        transactionArrayList.add(trans);
    }

    /**
     * Creates and adds a transaction to the list, given the transaction info.
     * @param startingCurrency String representing the starting currency.
     * @param endingCurrency String representing the ending currency.
     * @param startingAmount Double representing the starting amount.
     * @param endingAmount Double representing the ending amount.
     * @param fee Double representing the fee charged for conversion.
     */
    public void addNewTransaction(String startingCurrency, String endingCurrency, double startingAmount, double endingAmount, double fee) {
        Transaction newTrans = new Transaction(startingCurrency, endingCurrency, startingAmount, endingAmount, fee);
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
