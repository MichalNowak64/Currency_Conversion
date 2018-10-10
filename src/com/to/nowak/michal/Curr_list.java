package com.to.nowak.michal;
import java.util.ArrayList;
import java.util.List;

public class Curr_list {
    private  List<Currency> lista = new ArrayList<Currency>();

    public List<String> get_curr_list_by_name() {
        List<String> by_name=new ArrayList<String>();
        for(int i=0;i<lista.size();i++){
            by_name.add(lista.get(i).getName());
        }
        return by_name;
    }

    public Curr_list(List<Currency> lista) {
        this.lista = lista;
    }

    public void print_curr_list(){
        for(int i=0;i<lista.size();i++){
            System.out.println("\n");
            System.out.println("nazwa_waluty : " + lista.get(i).getName());
            System.out.println("przelicznik : " + lista.get(i).getMultipler());
            System.out.println("kod_waluty : " + lista.get(i).getCode());
            System.out.println("kurs_sredni : " + lista.get(i).getRate());
        }
    }
}
