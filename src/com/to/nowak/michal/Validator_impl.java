package com.to.nowak.michal;

public class Validator_impl implements Validator {

    private double inputDouble;

    @Override
    public boolean validateInput(String input) {
        if (input.isEmpty()) {
            return false;
        }
        try {
            inputDouble = Double.parseDouble(input);
        } catch (Exception e) {
            return false;
        }
        return !(inputDouble < 0);
    }
}
