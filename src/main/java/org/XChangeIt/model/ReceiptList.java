package org.XChangeIt.model;

import java.util.ArrayList;

/**
 * Class for storing all the processed receipt data for a current session.
 */
public class ReceiptList {
    private final ArrayList<Receipt> receiptList = new ArrayList<>();           //Arraylist to store all the receipts

    /**
     * Constructor for constructing a list of receipts to store all the generated receipts.
     * @param receipt Receipt type added to the local Arraylist of Receipts.
     */
    public void addReceipt(Receipt receipt) {

        receiptList.add(receipt);      //Adds the transaction to the array list
    }

    /**
     * Method to get receipt at a given index from the receiptList.
     * @param i integer type, index for the desired receipt.
     * @return Receipt type with data for a previously set transaction.
     */
    public Receipt getReceiptByIndex(int i) {
        return receiptList.get(i);
    }

    /**
     * Method to get the entire Arraylist with n receipts for the given session.
     * @return Arraylist of Receipt type containing data for all the receipts generated.
     */
    public ArrayList<Receipt> getReceiptArrayList() {
        return receiptList;
    }
}
