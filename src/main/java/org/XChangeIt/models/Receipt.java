package org.XChangeIt.models;

public class Receipt {
    private final String receiptText;

    /**
     * Constructs a new receipt object to store the receipt.
     * @param trans Transaction object to make the receipt from.
     * @param fees Double variable to hold the amount charged in fees for this transaction
     */
    public Receipt(Transaction trans, double fees) {
        // The formatting of "receiptText" here is a placeholder. Change if need-be.
        this.receiptText = "Receipt:" +
                "\n\nTransaction Date and Time: \t\t" + trans.getTransactionTime().toString() +
                "\nStarting Currency and Amount: \t\t" + trans.getStartingAmount() + " " + trans.getStartingCurrency() +
                "\nEnding Currency and Amount: \t\t" + trans.getEndingAmount() + " " + trans.getEndingCurrency() +
                "\nTransaction Fees: \t\t\t\t" + fees + " " + trans.getEndingCurrency() +
                "\n\nThank you for doing business with us. Please come again.";
    }

    /**
     * Function to "print" the receipt. Prints the receipt to a file to simulate printing through a printer
     */
    public void printReceipt() {
        // Replace this with code to output to file later.
        System.out.print(receiptText);
    }

    /**
     * Function to return the receipt text. Useful for GUI
     */
    public String getReceiptTest()
    {
        return receiptText;
    }
}
