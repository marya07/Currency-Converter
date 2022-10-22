package org.XChangeIt;

public class DataStorage
{
    private String targetName;         //Holds the name for the other currency
    private double exchangeRate;       //Note, rate is always in terms of 1 USD to other $$
    private double inverseRate;        //Note, rate is always in terms of 1 USD to other $$

    public void DataStorage()
    {
        targetName = "Null";
        exchangeRate = 2.0;
        inverseRate = 0.5;
    }
    public void DataStorage(String name, double numE, double numI)
    {
        targetName = name;
        exchangeRate = numE;
        inverseRate = numI;
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
    public void setInverseRate(double numI)
    {
        inverseRate = numI;
    }
    public double getInverseRate()
    {
        return inverseRate;
    }



}
