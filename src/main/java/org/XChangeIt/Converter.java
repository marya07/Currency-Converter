package org.XChangeIt;
import org.XChangeIt.models.DataStorage;

import java.io.File;
import java.text.NumberFormat;
import java.util.Locale;

// Class to implement conversion functions using the given data
public class Converter {
    public Converter(String fromCurrency, int amount) {
        File file = new File("src/main/resources/ExchangeRates.xml");
        DataExtractor extractor = new DataExtractor(file, fromCurrency);
        this.currencyData = extractor.extraction();
        this.amount = amount;
    }

    public String doConvert() {
        double convertedAmount;
        convertedAmount = ((1/currencyData.getExchangeRate())*amount);
        return (NumberFormat.getCurrencyInstance(new Locale("en", "US"))
                .format(convertedAmount));
    }
    final private DataStorage currencyData;
    final private int amount;
}
