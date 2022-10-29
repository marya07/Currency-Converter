package org.XChangeIt;

import java.text.NumberFormat;
import java.util.Locale;

public class Money {
    public Money(String c, double a){
        this.currency = c;
        this.amount = a;
    }
    public double getAmount(){
        return this.amount;
    }

    public String getCurrency(){
        return this.currency;
    }

    public String doConvert() {
        double convertedAmount;
        XmlDataExtractor extractor = new XmlDataExtractor(currency);
        double rate = extractor.extractExchangeRate();
        convertedAmount = ((1/ rate)*amount);

        return (NumberFormat.getCurrencyInstance(new Locale("en", "US"))
                .format(convertedAmount));
    }

    final private String currency;
    final private double amount;
}
