package com.to.nowak.michal;

public class Main {

    public static void main(String[] args) {
        Currency euro=new Currency("euro",1,"EUR",4.391);
        Calculate licz=new Calculate();
        System.out.println( licz.count(euro.getRate(),euro.getMultipler(),100));

        XML_Provider test=new XML_Provider();
        Curr_list listatest=new Curr_list(test.get_data());
        listatest.print_curr_list();

	// write your code here
    }
}
