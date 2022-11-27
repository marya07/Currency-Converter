package org.XChangeIt.model;

import java.util.ArrayList;

public class ReceiptList {
    private final ArrayList<Receipt> receiptList = new ArrayList<>();

    public void addReceipt(Receipt receipt) {

        receiptList.add(receipt);      //Adds the transaction to the array list
    }

    /**
     * Gets a transaction from the list by it's index.
     * @param i Index to get the transaction from
     * @return Transaction object from that location.
     */
    public Receipt getReceiptByIndex(int i) {
        return receiptList.get(i);
    }

    public ArrayList<Receipt> getReceiptArrayList() {
        return receiptList;
    }
}
