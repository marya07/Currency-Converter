package org.XChangeIt;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

// Class to implement conversion functions using the given data
public class Convert {
    public Convert() {}
    public void setFromCurrency(){
        Scanner S = new Scanner(System.in);
        System.out.println("Convert from: ");
        fromCurrency = S.nextLine();
    }
    public void setAmount(){
        Scanner S = new Scanner(System.in);
        System.out.println("Amount: ");
        amount = S.nextInt();
    }

    public String doConvert() throws Exception {

        double convertedAmount;
        this.setFromCurrency();
        this.setAmount();
        XmlDataExtractor extractor = new XmlDataExtractor(fromCurrency);
        this.rate = extractor.extractExchangeRate();
        convertedAmount = ((1/rate)*amount);

        return (NumberFormat.getCurrencyInstance(new Locale("en", "US"))
                .format(convertedAmount));
    }

    final private String toCurrency = "USD";
    private String fromCurrency;
    private double rate;
    private int amount;
}
