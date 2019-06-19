package org.montanajr.kolo02;

public class Interp implements Expression {

    private String exp;

    public Interp(String exp) {
        this.exp = exp;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.launchDecoder(exp);
    }
}
