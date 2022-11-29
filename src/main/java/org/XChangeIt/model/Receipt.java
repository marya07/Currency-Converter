package org.XChangeIt.model;

import org.XChangeIt.translation.Translator;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;

/**
 * Class for displaying receipts with data for a processed transaction.
 */
public class Receipt {
    private final String receiptText;   //Creates a private string variable to hold the receipt for the transaction

    /**
     * Function to translate the data from the transaction into a receipt format
     * @param transaction transaction parameter that gets the data from the transaction and puts it into a receipt format
     * @param translator translator parameter that holds the translation
     */
    public Receipt(Transaction transaction, Translator translator) {
        //Gets the relevant data to produce a receipt. The data is from the transactions
        this.receiptText = "\n\n" + translator.getSummaryText() +
                "\n\n" + translator.getTransactionProcessed() +  transaction.getTransactionTime().toString() +
                "\n" + translator.getCurrencyDeposited() + transaction.getStartingAmount().getCurrencyType() + " " +
                transaction.getStartingAmount().getAmount() + "\n" + translator.getCurrencyWithdrawn() +
                transaction.getEndingAmount().getCurrencyType() + " " + transaction.getEndingAmount().getAmount() +
                "\n" + translator.getFeeCharged() + transaction.getFees().getCurrencyType() + " " +
                transaction.getFees().getAmount();
        printReceipt();
    }

    /**
     * Function to "print" the receipt. Prints the receipt to a file to simulate printing through a printer
     */
    public void printReceipt()
    {
        try
        {
            //Opens the receipts file in append mode.
            BufferedWriter receiptFile = new BufferedWriter(
                    new FileWriter("src/main/resources/Output/Receipts.txt", true));
            receiptFile.write(receiptText + "\n\n\n");     //Appends the receipt data to the file
            receiptFile.close();                //Closes the connection to the file
        }
        //Catches if the file does not exist
        catch (FileNotFoundException FNFE)
        {
            try
            {
                System.out.println("Output file not found. Creating output file.");
                //Creates the output file to output the receipt
                FileWriter myWriter = new FileWriter("src/main/resources/Output/Receipts.txt");
                myWriter.write(receiptText + "\n\n\n");    //Write the receipt to the file
                myWriter.close();               //Close the output file
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
     * Function to return the receipt data also, calls the function that outputs to a file.
     * When this function is called, the function that prints to a file is called
     * @return receiptText variable that holds the text for the receipt
     */
    public String getReceiptData() {
        return receiptText;
    }
}
