package com.to.nowak.michal;

public class Calculate {
    private CurrencyList currencyList;

    public Calculate( CurrencyList currencyList) {
        this.currencyList = currencyList;
    }
    public double count(double amount,int left,int right){
        Currency leftCurrency=currencyList.getCurrencyList().get(left);
        Currency rightCurrency=currencyList.getCurrencyList().get(right);
        double wynik = amount * (rightCurrency.getMultipler() / rightCurrency.getRate()) / (leftCurrency.getMultipler() / leftCurrency.getRate());
        return wynik;}

}
