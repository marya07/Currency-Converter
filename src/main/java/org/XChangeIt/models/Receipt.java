package org.XChangeIt.models;

import java.io.*;

public class Receipt {
    private final String receiptText;

    /**
     * Constructs a new receipt object to store the receipt.
     * @param trans Transaction object to make the receipt from.
     * @param
     */
    public Receipt(Transaction trans, Translator language) {
        String receipttxt;      //Creates a string variable to hold the receipt for the transaction
        //Switches through the types of supported languages and changes the receipt text based on what is necessary
        switch (language)
        {
            case ENGLISH:
            {
                //If the language is English, make the language of the receipt English
                receipttxt = "Transaction Receipt: " +
                        "\n\nTransaction Date and Time: \t\t" + trans.getTransactionTime().toString() +
                        "\nStarting Currency and Amount: \t\t" + trans.getStartingAmount() + " " + trans.getStartingCurrency() +
                        "\nEnding Currency and Amount: \t\t" + trans.getEndingAmount() + " " + trans.getEndingCurrency() +
                        "\nTransaction Fees: \t\t\t\t" + trans.getTransactionFee() + " " + trans.getEndingCurrency() +
                        "\n\nThank you for doing business with us. Please come again.\n\n\n";
            }
            case CHINESE:
            {
                //If the language is Chinese, make the language of the receipt Chinese
                receipttxt = "交易收据：" +
                        "\n\n交易日期和时间：\t\t" + trans.getTransactionTime().toString() +
                        "\n起始货币和金额：\t\t" + trans.getStartingAmount() + " " + trans.getStartingCurrency() +
                        "\n期末货币和金额：\t\t" + trans.getEndingAmount() + " " + trans.getEndingCurrency() +
                        "\n交易费用：\t\t\t\t" + trans.getTransactionFee() + " " + trans.getEndingCurrency() +
                        "\n\n感谢您与我们开展业务。欢迎再来。\n\n\n";
            }
            case FRENCH:
            {
                //If the language is French, make the language of the receipt French
                receipttxt = "Reçu de transaction: " +
                        "\n\nDate et heure de la transaction: \t\t" + trans.getTransactionTime().toString() +
                        "\nDevise de départ et montant: \t\t" + trans.getStartingAmount() + " " + trans.getStartingCurrency() +
                        "\nDevise de fin et montant: \t\t" + trans.getEndingAmount() + " " + trans.getEndingCurrency() +
                        "\nLes frais de transaction: \t\t\t\t" + trans.getTransactionFee() + " " + trans.getEndingCurrency() +
                        "\n\nMerci de faire des affaires avec nous. Reviens s'il te plait.\n\n\n";
            }
            case GERMAN:
            {
                //If the language is German, make the language of the receipt German
                receipttxt = "Transaktionsbeleg: " +
                        "\n\nDatum und Uhrzeit der Transaktion: \t\t" + trans.getTransactionTime().toString() +
                        "\nStartwährung und Betrag: \t\t" + trans.getStartingAmount() + " " + trans.getStartingCurrency() +
                        "\nEndwährung und Betrag: \t\t" + trans.getEndingAmount() + " " + trans.getEndingCurrency() +
                        "\nTransaktions Gebühren: \t\t\t\t" + trans.getTransactionFee() + " " + trans.getEndingCurrency() +
                        "\n\nVielen Dank, dass Sie mit uns Geschäfte machen. Bitte komm wieder. \n\n\n";
            }
            case JAPANESE:
            {
                //If the language is Japanese, make the language of the receipt Japanese
                receipttxt = "取引領収書: " +
                        "\n\n取引日時: \t\t" + trans.getTransactionTime().toString() +
                        "\n開始通貨と金額: \t\t" + trans.getStartingAmount() + " " + trans.getStartingCurrency() +
                        "\n終了通貨と金額: \t\t" + trans.getEndingAmount() + " " + trans.getEndingCurrency() +
                        "\n取引手数料: \t\t\t\t" + trans.getTransactionFee() + " " + trans.getEndingCurrency() +
                        "\n\nお取引いただきありがとうございます。また来てください。\n\n\n";
            }
            case PORTUGUESE:
            {
                //If the language is Portuguese, make the language of the receipt Portuguese
                receipttxt = "Recibo da transação: " +
                        "\n\nData e hora da transação: \t\t" + trans.getTransactionTime().toString() +
                        "\nMoeda inicial e valor: \t\t" + trans.getStartingAmount() + " " + trans.getStartingCurrency() +
                        "\nMoeda Final e Valor: \t\t" + trans.getEndingAmount() + " " + trans.getEndingCurrency() +
                        "\nTaxas de transação: \t\t\t\t" + trans.getTransactionFee() + " " + trans.getEndingCurrency() +
                        "\n\nAgradeço a você por fazer negócios conosco. Por favor, volte. \n\n\n";
            }
            case RUSSIAN:
            {
                //If the language is Russian, make the language of the receipt Russian
                receipttxt = "Квитанция о транзакции: " +
                        "\n\nДата и время транзакции: \t\t" + trans.getTransactionTime().toString() +
                        "\nНачальная валюта и сумма: \t\t" + trans.getStartingAmount() + " " + trans.getStartingCurrency() +
                        "\nКонечная валюта и сумма: \t\t" + trans.getEndingAmount() + " " + trans.getEndingCurrency() +
                        "\nОперационные издержки: \t\t\t\t" + trans.getTransactionFee() + " " + trans.getEndingCurrency() +
                        "\n\nБлагодарим вас за сотрудничество с нами. Пожалуйста приходи еще. \n\n\n";
            }
            case SPANISH:
            {
                //If the language is Spanish, make the language of the receipt Spanish
                receipttxt = "Recibo de la transacción: " +
                        "\n\nFecha y hora de la transacción: \t\t" + trans.getTransactionTime().toString() +
                        "\nMoneda inicial y cantidad: \t\t" + trans.getStartingAmount() + " " + trans.getStartingCurrency() +
                        "\nMoneda final y cantidad: \t\t" + trans.getEndingAmount() + " " + trans.getEndingCurrency() +
                        "\nTarifas de transacción: \t\t\t\t" + trans.getTransactionFee() + " " + trans.getEndingCurrency() +
                        "\n\nGracias por hacer negocios con nosotros. Por favor ven de nuevo. \n\n\n";
            }
            this.receiptText = receipttxt;      //Stores the receipt text into the storage variable
        }
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
        //Catches if the file does not exist
        catch (FileNotFoundException FNFE)
        {
            try
            {
                System.out.println("Output file not found. Creating output file.");
                //Creates the output file to output the receipt
                FileWriter myWriter = new FileWriter("src/main/Output/Transaction Receipts.txt");
                myWriter.write(receiptText);    //Write the receipt to the file
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
     * Function to return the receipt text. Useful for GUI
     */
    public String getReceiptText()
    {
        return receiptText;
    }
}
