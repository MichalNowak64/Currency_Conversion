package com.to.nowak.michal;
import java.util.ArrayList;
import java.util.List;

public class Calculate {
    private Validator_impl validator;
    private Curr_list currencyList;

    public double count() {
        return 0;
    }

    public Calculate(Validator_impl validator, Curr_list currencyList) {
        this.validator = validator;
        this.currencyList = currencyList;
    }

    public String count(String input, Object selectedItemLeft, Object selectedItemRight) {
        if (validator.validateInput(input)) {
            Currency leftCurrency = currencyList.getCurrencyByName(selectedItemLeft.toString());
            Currency rightCurrency = currencyList.getCurrencyByName(selectedItemRight.toString());
            double value = Double.parseDouble(input);
            double wynik = value * (rightCurrency.getMultiplier() / rightCurrency.getRate()) / (leftCurrency.getMultiplier() / leftCurrency.getRate());
            return String.format("%.2f", wynik);
        }
        return "Błąd";
    }

}
