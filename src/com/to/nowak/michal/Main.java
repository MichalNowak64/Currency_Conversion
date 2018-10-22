package com.to.nowak.michal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        View view=new View();
        Provider_XML test=new Provider_XML();
        CurrencyList list_of_curr=new CurrencyList(test.get_data());
        Calculate przelicz=new Calculate(list_of_curr);
        Scanner odczyt = new Scanner(System.in);
        Validator validator = new Validator_intiger();



        //view.print_curr_list(list_of_curr.getLista());
        view.print_curr_by_name(list_of_curr.getCurrencyList());

        int left,right;
        double amount,value;

        System.out.print("Wybierz walute: ");
        left=odczyt.nextInt();
        if(!validator.check_data(left)) return;

        System.out.print("Ilosc waluty: ");
        amount=odczyt.nextDouble();

        view.print_curr_by_name(list_of_curr.getCurrencyList());

        System.out.print("Wybierz walute: ");
        right=odczyt.nextInt();

        value=przelicz.count(amount,left,right);

        view.print_resoult(list_of_curr.getCurrencyList().get(left).getCode(),list_of_curr.getCurrencyList().get(right).getCode(),amount,value);


        //view.print_curr_by_code(list_of_curr.getLista());


	// write your code here
    }
}
