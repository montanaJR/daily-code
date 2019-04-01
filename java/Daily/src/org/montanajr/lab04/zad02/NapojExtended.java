package org.montanajr.lab04.zad02;

import java.util.ArrayList;
import java.util.List;

public class NapojExtended implements Napoj {

    private List<Napoj> napoje = new ArrayList<>();
    private List<Dodatek> dodatki = new ArrayList<>();
    private String name, data;


    public NapojExtended(String name) {
        this.name = name;
    }

    @Override
    public void addNapoj(Napoj napoj) {
        napoje.add(napoj);
    }

    @Override
    public void addDodatek(Dodatek dodatek) {
        dodatki.add(dodatek);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        double sum = 0;

        for(Napoj n : napoje){
            sum = sum + n.getPrice();
        }

        for(Dodatek d : dodatki){
            sum = sum + d.getPrice();
        }

        return sum;
    }



    @Override
    public String getData() {

        String s = "Nazwa: " +name + "\n" + "Cena: " + this.getPrice() + " z�\n" + "Opis: " + data + "\n";

        for(Napoj n : napoje){
            System.out.println(n.getData());
        }

        for(Dodatek d : dodatki){
            System.out.println(d.getData());
        }

        System.out.println("");
       return s;


    }

    @Override
    public void setPrice(double price) {
    //
    }

    @Override
    public void setData(String s){
        data = s +"\n"
                +"-----------------------------------------------------------------------\n";
    }

}
