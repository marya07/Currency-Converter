package org.XChangeIt;

// This was used for testing. It might be needed later. Otherwise, delete. - Danial Ahari
import org.XChangeIt.models.Receipt;
import org.XChangeIt.models.TransactionList;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // This bit of code briefly tested to see if basic features of Conversion and ConversionList were working.
        // ConversionList List = new ConversionList();
        // List.addNewConversion("USD","CFA",659.90,0.0015);
        // System.out.println(List.getConversionByTargetCurrency("CFA").getExchangeRate());
        //
        // And this bit of code briefly tested Transaction and TransactionList.
        // TransactionList List = new TransactionList();
        // List.addNewTransaction(new Date(), "USD", "EUR",1,1);
        // System.out.println(List.getTransactionByIndex(0).getEndingCurrency());
        // The first two lines of the transaction test, combined with the following, tests receipts.
        // Receipt rec = new Receipt(List.getTransactionByIndex(0));
        // rec.printReceipt();
        // - Danial Ahari
    }
}