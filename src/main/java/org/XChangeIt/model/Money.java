package org.XChangeIt.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class Money {
    private String currencyType;
    private double amount;

    public Money(String currencyType, double amount){
        this.currencyType = currencyType;
        this.amount = BigDecimal.valueOf(amount).setScale(2, RoundingMode.HALF_DOWN).doubleValue();
    }

    public String getCurrencyType(){
        return currencyType;
    }
    public Double getAmount(){

        return amount;
    }

}
