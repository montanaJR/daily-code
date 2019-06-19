package org.montanajr.lab07.zad01;

import java.util.Map;

public class Kierunek implements Exp {

    String kierunek;

    public Kierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    @Override
    public String interpret(Map<String, Exp> variables) {
        return kierunek;
    }
}
