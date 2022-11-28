package org.XChangeIt.controller;
import org.XChangeIt.model.DataStorage;
import org.XChangeIt.model.Money;

import java.io.File;

/**
 * Class for handling conversion to USD given an instance of Money with currency type and amount.
 */
public class Converter {
    /**
     * Function to convert money based on the passed money object
     * @param m Money object to
     */
    public Converter(Money m) {
        //New file object to get the exchange rates
        File file = new File("src/main/resources/ExchangeRates.xml");
        org.XChangeIt.controller.DataExtractor extractor = new DataExtractor(file, m.getCurrencyType());

        //Gets the currency data to convert
        this.currencyData = extractor.extraction();
        //Gets the amount to convert
        this.amount = m.getAmount();

        double converted;

        //Gets the converted amount into USD(USD for the moment)
        converted = ((1/currencyData.getExchangeRate())*amount);

        //Deducts the fees from the converted amount
        this.convertedAmount = new Money("USD", (converted - deductFees(converted)));

        //Gets the fees
        this.fees = new Money("USD", deductFees(converted));
    }

    /**
     * Function to get the converted amount, converted into the desired currency
     * @return Money object that has the converted amount
     */
    public Money getConvertedAmount(){
        return this.convertedAmount;
    }

    /**
     * Function to deduct the fees
     * @param gross double variable that holds
     * @return double that takes the fees and the gross product and identifies the fees
     */
    public double deductFees(double gross){
        return gross * feeAmount;
    }

    /**
     * Function to return the fees
     * @return fees Money object to get the fees
     */
    public Money getFees() {
        return this.fees;
    }

    final private DataStorage currencyData;     //Variable to hold the currency data
    final private double amount;                //Variable to hold the amount to convert
    final private Money convertedAmount;        //Variable to hold the converted amount and its relevant data
    final private Money fees;                   //Variable to hold the fees and its relevant data
    final private double feeAmount = 0.022;      //Variable to hold the fee amount
}
