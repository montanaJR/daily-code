package org.montanajr.lab07.zad01;

import java.util.Map;

interface Exp {

     String interpret(Map<String,Exp> variables);
}
