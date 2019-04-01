package org.montanajr.lab04.zad02;

import java.util.ArrayList;
import java.util.List;

public class DodatekExtended implements Dodatek {
    private List<Dodatek> dodatki = new ArrayList<>();
    private String name, data;

    public DodatekExtended(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        double sum = 0;
        for(Dodatek p : dodatki){
            sum = sum + p.getPrice();
        }
        return sum;
    }

    @Override
    public String getData() {
        String s = "Nazwa: " +name + "\n" + "Cena: " + this.getPrice() + " z�\n" + "Opis: " + data;
        for(Dodatek p : dodatki){
            s +=    "\n"+ p.getData() + "\n"
                    + "---------------------------------------------------------------------------"
                    + "";
        }
        return s;
    }

    @Override
    public void setPrice(double price) {

    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void setData(String s) {
        data = s;
    }
}
