package com.to.nowak.michal;

public class Main {

    public static void main(String[] args) {
        Currency euro=new Currency("EUR","euro",1,4.391);
        Calculate licz=new Calculate();
        System.out.println( licz.count(euro.getRate(),euro.getMultipler(),100));

        XML_Provider test=new XML_Provider();
        test.get_data();

	// write your code here
    }
}
