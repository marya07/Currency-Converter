package org.XChangeIt;


public class DataStorage {
     //Note, rate is always in terms of 1 USD to other $$


    public void DataStorage()
    {
        targetName = "Null";
        exchangeRate = 2.0;
    }
    public void DataStorage(String name, double numE, double numI)
    {
        targetName = name;
        exchangeRate = numE;
    }

    public void setName(String name)
    {
        targetName = name;
    }
    public String getName()
    {
        return targetName;
    }
    public void setExchangeRate(double numE)
    {
        exchangeRate = numE;
    }
    public double getExchangeRate()
    {
        return exchangeRate;
    }

    private String targetName;         //Holds the name for the other currency
    private String targetCurrency;
    private double exchangeRate;       //Note, rate is always in terms of 1 USD to other $$
    private String inverseDescription;

}
