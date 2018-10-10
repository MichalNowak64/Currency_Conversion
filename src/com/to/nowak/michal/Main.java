package com.to.nowak.michal;

public class Main {

    public static void main(String[] args) {

        Provider_XML test=new Provider_XML();
        Curr_list listatest=new Curr_list(test.get_data());

        Calculate przelicz=new Calculate();
        System.out.println(przelicz.count(listatest.getLista().get(1).getRate(),listatest.getLista().get(1).getMultipler(),100));

	// write your code here
    }
}
