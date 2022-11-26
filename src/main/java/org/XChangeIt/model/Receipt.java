package org.XChangeIt.model;

import org.XChangeIt.translation.Translator;

public class Receipt {
    private final String receiptText;


    public Receipt(Transaction transaction, Translator translator) {
        // The formatting of "receiptText" here is a placeholder. Change if need-be.
        this.receiptText = translator.getSummaryText() +
                "\n\n" + translator.getTransactionProcessed() +  transaction.getTransactionTime().toString() +
                "\n" + translator.getCurrencyDeposited() + transaction.getStartingAmount().getCurrencyType() + " " +
                transaction.getStartingAmount().getAmount() + "\n" + translator.getCurrencyWithdrawn() +
                transaction.getEndingAmount().getCurrencyType() + " " + transaction.getEndingAmount().getAmount() +
                "\n" + translator.getFeeCharged() + transaction.getFees().getCurrencyType() + " " +
                transaction.getFees().getAmount() + "\n\n" + translator.getThanksMessage();
    }

    /**
     * Function to "print" the receipt.
     */
    public String getReceiptData() {
        // Replace this with code to output to file later.
        return receiptText;
    }
}
