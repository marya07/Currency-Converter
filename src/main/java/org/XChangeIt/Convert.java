package org.XChangeIt;
import java.text.NumberFormat;
import java.util.Locale;

// Class to implement conversion functions using the given data
public class Convert {
    public Convert(Money m) throws Exception {
        this.fromCurrency = m.getCurrency();
        this.amount = m.getAmount();
    }

    public String doConvert() throws Exception {
        double convertedAmount;
        XmlDataExtractor extractor = new XmlDataExtractor(fromCurrency);
        this.rate = extractor.extractExchangeRate();
        convertedAmount = ((1/rate)*amount);

        return (NumberFormat.getCurrencyInstance(new Locale("en", "US"))
                .format(convertedAmount));
    }

    final private String toCurrency = "USD";
    private String fromCurrency;
    private double rate;
    private double amount;
}
