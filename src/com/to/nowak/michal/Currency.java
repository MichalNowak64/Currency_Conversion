package com.to.nowak.michal;

public class Currency {
    private String code;
    private String name;
    private  int multipler;
    private double rate;

    public int getMultipler() {
        return multipler;
    }

    public void setMultipler(int multipler) {
        this.multipler = multipler;
    }
}
