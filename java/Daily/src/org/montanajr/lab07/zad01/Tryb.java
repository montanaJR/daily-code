package org.montanajr.lab07.zad01;

import java.util.Map;

public class Tryb implements Exp{
    String tryb;

    public Tryb(String tryb) {
        this.tryb = tryb;
    }

    @Override
    public String interpret(Map<String, Exp> variables) {
        return tryb;
    }
}
