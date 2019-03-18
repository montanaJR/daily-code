package org.montanajr.lab03.zad03;

public abstract class Student {
    String opis = "nieznany student";
    int id = 0;

    public String getOpis() {
        return opis;
    }

    public int getId() {
        return id;
    }


    public abstract String rodzajStypendiow();
}
