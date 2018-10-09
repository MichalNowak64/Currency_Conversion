package com.to.nowak.michal;

public class Main {

    public static void main(String[] args) {
        Currency euro=new Currency("EUR","euro",1,4.391);
        Calculate licz=new Calculate();
        System.out.println( licz.count(euro.getRate(),euro.getMultipler(),100));
	// write your code here
    }
}
