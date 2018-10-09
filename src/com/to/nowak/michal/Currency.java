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

    public Currency(String code, String name, int multipler, double rate) {
        this.code = code;
        this.name = name;
        this.multipler = multipler;
        this.rate = rate;
    }
}
