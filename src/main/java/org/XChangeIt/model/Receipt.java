package org.XChangeIt.model;

public class Receipt {
    private final String receiptText;

    /**
     * Constructs a new receipt object to store the receipt.
     * @param trans Transaction object to make the receipt from.
     */
    public Receipt(Transaction trans) {
        // The formatting of "receiptText" here is a placeholder. Change if need-be.
        this.receiptText = "Your Transaction Information:" +
                "\n\nTransaction date and time: " + trans.getTransactionTime().toString() +
                "\nCurrency Deposited: " + trans.getStartingAmount() + trans.getStartingCurrency() +
                "\nCurrency Withdrawn: " + trans.getEndingAmount() + trans.getEndingCurrency() +
                "\n\nThank you for doing business with us. Please come again.";
    }

    /**
     * Function to "print" the receipt.
     */
    public void printReceipt() {
        // Replace this with code to output to file later.
        System.out.print(receiptText);
    }
}
