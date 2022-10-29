package org.XChangeIt.models;

import java.util.ArrayList;

public class ConversionList {
    private ArrayList<Conversion> conversionArrayList = new ArrayList<Conversion>();

    /**
     * Adds a conversion to the list, given the conversion object.
     * @param conv The Conversion object to be added to the list.
     */
    public void addConversion(Conversion conv) {
        conversionArrayList.add(conv);
    }

    /**
     * Creates and adds a conversion to the list, given the conversion info.
     * @param baseCurrency String representing the start currency.
     * @param targetCurrency String representing the end currency.
     * @param exchangeRate Double representing the exchange rate.
     * @param inverseRate Double representing the inverse exchange rate.
     */
    public void addNewConversion(String baseCurrency, String targetCurrency, double exchangeRate, double inverseRate) {
        Conversion newConv = new Conversion(baseCurrency, targetCurrency, exchangeRate, inverseRate);
        conversionArrayList.add(newConv);
    }

    /**
     * Gets a conversion from the list by it's index.
     * @param i Index to get the conversion from
     * @return Conversion object from that location.
     */
    public Conversion getConversionByIndex(int i) {
        return conversionArrayList.get(i);
    }

    /**
     * Gets a conversion from the list by it's target currency.
     * @param targetCurrency String representing target currency to search for to get the conversion.
     * @return Conversion object with that target currency.
     */
    public Conversion getConversionByTargetCurrency(String targetCurrency) {
        for (Conversion conversion : conversionArrayList) {
            if (conversion.getTargetCurrency().compareToIgnoreCase(targetCurrency) == 0) {
                return conversion;
            }
        }
        return null;
    }
}
