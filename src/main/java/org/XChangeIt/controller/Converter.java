package org.XChangeIt.controller;
import org.XChangeIt.model.DataStorage;
import org.XChangeIt.model.Money;

import java.io.File;

public class Converter {
    /**
     * Creates a Converter object to handle conversion of given amount and currency type to base currency.
     */
    public Converter(Money m) {
        File file = new File("src/main/resources/ExchangeRates.xml");
        DataExtractor extractor = new DataExtractor(file, m.getCurrencyType());
        this.currencyData = extractor.extraction();
        this.amount = m.getAmount();
    }

    /**
     * Converter method to perform conversion of given amount.
     * @return
     */
    public Money doConvert() {
        double convertedAmount;
        convertedAmount = ((1/currencyData.getExchangeRate())*amount);
        Money money = new Money(currencyData.getBaseCurrency(), convertedAmount);
        return money;
    }

    final private DataStorage currencyData;
    final private double amount;
}
