package org.montanajr.lab02.factory;


public class Dodawanie extends Wynik {

    
    public Dodawanie(String liczba1, String liczba2) {


        if (!liczba1.matches("[0-9+-]+") || !liczba2.matches("[0-9+-]+")) {
            throw new IllegalArgumentException("Z�y format danych");
        }

        wynik = Float.parseFloat(liczba1) + Float.parseFloat(liczba2);
    }
}
