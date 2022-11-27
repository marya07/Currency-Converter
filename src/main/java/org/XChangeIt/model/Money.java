package org.XChangeIt.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Money {
    private String currencyType;        //String variable to hold the type of currency
    private double amount;              //double variable to hold the amount of currency

    /**
     * Constructor function to build the currency data
     * @param currencyType string variable holding the type of currency to be processed
     * @param amount double variable holding how much currency to process
     */
    public Money(String currencyType, double amount){
        this.currencyType = currencyType;       //Stores the currency type
        this.amount = BigDecimal.valueOf(amount).setScale(2, RoundingMode.HALF_DOWN).doubleValue(); //Stores the amount of currency and rounds the decimals
    }

    /**
     * Function to get the currency type
     * @return currencyType String variable holding the type of currency
     */
    public String getCurrencyType(){
        return currencyType;        //Returns the type of currency
    }

    /**
     * Function to return the amount of currency
     * @return amount double variable which holds the amount of currency
     */
    public Double getAmount(){

        return amount;      //Returns the amount of currency
    }

}
