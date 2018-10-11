package com.to.nowak.michal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        View view=new View();
        Provider_XML test=new Provider_XML();
        Curr_list list_of_curr=new Curr_list(test.get_data());
        Calculate przelicz=new Calculate();
        Scanner odczyt = new Scanner(System.in);



        //view.print_curr_list(list_of_curr.getLista());
        view.print_curr_by_name(list_of_curr.getLista());
        int choice;
        double amount,value;
        System.out.print("Wybierz walute: ");
        choice=odczyt.nextInt();
        System.out.print("Ilosc waluty: ");
        amount=odczyt.nextDouble();
        value=przelicz.count(list_of_curr.getLista().get(choice).getRate(),list_of_curr.getLista().get(choice).getMultipler(),amount);
        view.print_resoult(list_of_curr.getLista().get(choice).getCode(),"PLN",amount,value);


        //view.print_curr_by_code(list_of_curr.getLista());


	// write your code here
    }
}
