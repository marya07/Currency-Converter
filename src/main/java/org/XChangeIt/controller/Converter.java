package org.XChangeIt.controller;
import org.XChangeIt.model.DataStorage;
import org.XChangeIt.model.Money;

import java.io.File;

public class Converter {
    public Converter(Money m) {
        File file = new File("src/main/resources/ExchangeRates.xml");
        DataExtractor extractor = new DataExtractor(file, m.getCurrencyType());
        this.currencyData = extractor.extraction();
        this.amount = m.getAmount();

        double converted;
        converted = ((1/currencyData.getExchangeRate())*amount);
        this.convertedAmount = new Money("USD", (converted - deductFees(converted)));
        this.fees = new Money("USD", deductFees(converted));
    }

    public Money getConvertedAmount(){
        return this.convertedAmount;
    }
    public double deductFees(double gross){
        return gross * feeAmount;
    }
    public Money getFees() {
        return this.fees;
    }

    final private DataStorage currencyData;
    final private double amount;
    final private Money convertedAmount;
    final private Money fees;
    final private double feeAmount = 0.02;
}
