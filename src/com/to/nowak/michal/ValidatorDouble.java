package com.to.nowak.michal;

public class ValidatorDouble implements Validator {
    @Override
    public boolean check_data(Object input){
        double i;
        try{
            i=(Double) input;
        }
        catch (Exception e)
        {
            return false;
        }

        if(i<0) return false;

        return true;
    }
}