package com.to.nowak.michal;
import java.util.ArrayList;
import java.util.List;

public class CurrencyList {
    private  List<Currency> currencyList = new ArrayList<Currency>();

    public List<String> getCurrListByName() {
        List<String> by_name=new ArrayList<String>();
        for(int i = 0; i< currencyList.size(); i++){
            by_name.add(currencyList.get(i).getName());
        }
        return by_name;
    }

    public List<Currency> getCurrencyList() {
        return currencyList;
    }

    public CurrencyList(List<Currency> currencyList) {
        this.currencyList = currencyList;
    }
}
