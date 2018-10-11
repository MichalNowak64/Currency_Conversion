package com.to.nowak.michal;

import java.util.List;

public class View {
    void print_curr_list(List<Currency> lista){
        for(int i=0;i<lista.size();i++){
           System.out.println(lista.get(i).getName()+" "+lista.get(i).getCode()+" "+lista.get(i).getRate()+" "+lista.get(i).getMultipler());
        }

    }
    void print_curr_by_name(List<Currency> lista){
        for(int i=0;i<lista.size();i++){
            System.out.println(i+")"+lista.get(i).getName());
        }
    }
    void print_curr_by_code(List<Currency> lista) {
        for(int i=0;i<lista.size();i++){
            System.out.println(i+")"+lista.get(i).getCode());
        }
    }
    void print_resoult(String code1,String code2,double amount,double value){
        System.out.println(amount+" "+code1+"--->"+code2+ " = "+value);
    }
}
