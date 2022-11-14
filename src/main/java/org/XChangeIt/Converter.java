package org.XChangeIt;
import org.XChangeIt.models.DataStorage;
import org.XChangeIt.models.Money;

import java.io.File;
import java.text.NumberFormat;
import java.util.Locale;
public class Converter {
    /**
     * Creates a Converter object to handle conversion of given amount and currency type to base currency.
     * @param fromCurrency String for currency to convert from.
     * @param amount Total integer amount to convert to base currency.
     */
    public Converter(String fromCurrency, int amount) {
        File file = new File("src/main/resources/ExchangeRates.xml");
        DataExtractor extractor = new DataExtractor(file, fromCurrency);
        this.currencyData = extractor.extraction();
        this.amount = amount;
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
    final private int amount;
}
