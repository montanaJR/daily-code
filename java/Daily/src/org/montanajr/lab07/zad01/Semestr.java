package org.montanajr.lab07.zad01;

import java.util.Map;

public class Semestr implements Exp{

    String semestr;

    public Semestr(String semestr) {
        this.semestr = semestr;
    }

    @Override
    public String interpret(Map<String, Exp> variables) {
        return semestr;
    }
}
