//NIE ZROBIONE !!!
package com.to.nowak.michal;

public class Validator_intiger implements Validator {
    @Override
    public boolean check_data(Object input){
        int i;
        try{
            i=(Integer) input;
        }
        catch (Exception e)
        {
            return false;
        }

        if(i<0) return false;

        return true;
    }
}
