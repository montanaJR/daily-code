package org.montanajr.lab04.zad02;

public interface Napoj {
    public void addNapoj(Napoj napoj);

    public void addDodatek(Dodatek dodatek);

    public String getName();

    public double getPrice();

    public String getData();

    public void setPrice(double price);
    public void setData(String s);

}
