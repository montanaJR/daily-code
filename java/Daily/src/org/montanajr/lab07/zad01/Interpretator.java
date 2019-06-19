package org.montanajr.lab07.zad01;

import java.util.Map;

public class Interpretator implements Exp{

    private Exp result;

    public Interpretator(String exp){

        for (char ch : exp.toCharArray()){
            if(ch == '-'){

                continue;
            }
        }
    }
    @Override
    public String interpret(Map<String, Exp> variables) {
        return null;
    }

}
