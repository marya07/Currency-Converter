package org.XChangeIt.models;

public class Money {
    public Money(String currencyType, double amount){
        this.currencyType = currencyType;
        this.amount = amount;
    }

    public String getCurrencyType(){
        return currencyType;
    }
    public Double getAmount(){
        return amount;
    }
    private String currencyType;
    private double amount;
}
