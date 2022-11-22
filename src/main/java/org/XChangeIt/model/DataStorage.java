package org.XChangeIt.model;

public class DataStorage {

    private final String rateDescription;
    private final String rateDate;
    private final String baseCurrency;
    private final String targetCurrency;
    private final double exchangeRate;
    private final double inverseRate;

    /**
     * This function constructs a new record of a Conversion.
     * @param baseCurrency The string representing the start currency, most likely USD.
     * @param targetCurrency The string representing the end currency.
     * @param exchangeRate The double representing the exchange rate.
     * @param inverseRate The double representing the inverse exchange rate.
     */

    public DataStorage(String rateDescription, String rateDate, String baseCurrency, String targetCurrency, double exchangeRate, double inverseRate) {
        this.rateDescription = rateDescription;
        this.rateDate = rateDate;
        this.baseCurrency = baseCurrency;
        this.targetCurrency = targetCurrency;
        this.exchangeRate = exchangeRate;
        this.inverseRate = inverseRate;
    }

    /**
     * Function to return rate description.
     * @return String representing both base currency and target currency rates.
     */
    public String getRateDescription() {
        return rateDescription;
    }

    /**
     * Function to return date for the given rate.
     * @return String representing the date and time when rate was obtained.
     */
    public String getRateDate() {
        return rateDate;
    }

    /**
     * Function to return base currency.
     * @return String representing the base currency.
     */
    public String getBaseCurrency() {
        return baseCurrency;
    }

    /**
     * Function to return target currency.
     * @return String representing the target currency.
     */
    public String getTargetCurrency() {
        return targetCurrency;
    }

    /**
     * Function to return the exchange rate.
     * @return Double representing the exchange rate.
     */
    public double getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Function to return the inverse exchange rate.
     * @return Double representing the inverse exchange rate.
     */
    public double getInverseRate() {
        return inverseRate;
    }
}
