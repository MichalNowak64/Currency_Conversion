package com.to.nowak.michal;
import java.util.ArrayList;
import java.util.List;

public class Curr_list {
    private  List<Currency> currencyList = new ArrayList<Currency>();

    public Currency getCurrencyByName(String name) {
        for (Currency el : currencyList) {
            if (el.getName().equals(name)) {
                return el;
            }
        }
        return null;
    }

    public List<Currency> getLista() {
        return currencyList;
    }

    public Curr_list(List<Currency> lista) {
        this.currencyList = lista;
    }
}
