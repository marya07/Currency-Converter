package org.XChangeIt.model;

public class DataStorage {

    private final String rateDescription;       //String variable to hold the description of the exchange rate
    private final String rateDate;              //String variable to hold the date of the currency rate
    private final String baseCurrency;          //String variable to hold the base currency
    private final String targetCurrency;        //String variable to hold the target currency
    private final double exchangeRate;          //Double variable to hold the exchange rate of the exchange
    private final double inverseRate;           //Double variable to hold the inverse rate of the exchange

    /**
     * This function constructs a new record of a Conversion.
     * @param baseCurrency The string representing the start currency, most likely USD.
     * @param targetCurrency The string representing the end currency.
     * @param exchangeRate The double representing the exchange rate.
     * @param inverseRate The double representing the inverse exchange rate.
     */

    public DataStorage(String rateDescription, String rateDate, String baseCurrency, String targetCurrency, double exchangeRate, double inverseRate) {
        this.rateDescription = rateDescription;     //Stores the description of the rate
        this.rateDate = rateDate;                   //Stores the date of the rate
        this.baseCurrency = baseCurrency;           //Stores the base currency
        this.targetCurrency = targetCurrency;       //Stores the target currency
        this.exchangeRate = exchangeRate;           //Stores the exchange rate
        this.inverseRate = inverseRate;             //Stores the inverse transaction rate
    }

    /**
     * Function to return rate description.
     * @return rateDescription String representing both the base currency and the target currency rates.
     */
    public String getRateDescription() {
        return rateDescription;
    }

    /**
     * Function to return date for the given rate.
     * @return rateDate String representing the date and time when rate was obtained.
     */
    public String getRateDate() {
        return rateDate;
    }

    /**
     * Function to return base currency.
     * @return baseCurrency String representing the base currency.
     */
    public String getBaseCurrency() {
        return baseCurrency;
    }

    /**
     * Function to return target currency.
     * @return targetCurrency String representing the target currency.
     */
    public String getTargetCurrency() {
        return targetCurrency;
    }

    /**
     * Function to return the exchange rate.
     * @return exchangeRate Double representing the exchange rate.
     */
    public double getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Function to return the inverse exchange rate.
     * @return inverseRate Double representing the inverse exchange rate.
     */
    public double getInverseRate() {
        return inverseRate;
    }
}
