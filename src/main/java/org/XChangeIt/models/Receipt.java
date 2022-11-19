package org.XChangeIt.models;

import java.io.*;

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
    public void printReceipt()
    {
        try
        {
            //Opens the receipts file in append mode.
            BufferedWriter receiptFile = new BufferedWriter(new FileWriter("src/main/Output/Transaction Receipts.txt", true));
            receiptFile.write(receiptText);     //Appends the receipt data to the file
            receiptFile.close();                //Closes the connection to the file
        }
        //
        catch (FileNotFoundException FNFE)
        {
            try
            {
                System.out.println("Output file not found. Creating output file.");
                //Creates the output file to output the receipt to
                FileWriter myWriter = new FileWriter("src/main/Output/Transaction Receipts.txt");
                myWriter.write(receiptText);
                myWriter.close();
            }
            //Catches any problem from creating the file
            catch (Exception anything)
            {
                //Outputs the reason for the problem
                anything.getCause();
                anything.printStackTrace(System.out);
            }
        }
        //Catches any problem that remains
        catch (Exception anything)
        {
            //Outputs the reason for the problem
            anything.getCause();
            anything.printStackTrace(System.out);
        }
    }

    /**
     * Function to return the receipt text. Useful for GUI
     */
    public String getReceiptTest()
    {
        return receiptText;
    }
}
