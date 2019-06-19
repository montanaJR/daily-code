package org.montanajr.lab07.zad01;

import java.util.Map;

public class Specjalnosc implements Exp{
    String spec;

    public Specjalnosc(String spec) {
        this.spec = spec;
    }

    @Override
    public String interpret(Map<String, Exp> variables) {
        return spec;
    }
}
