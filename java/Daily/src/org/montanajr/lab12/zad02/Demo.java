package org.montanajr.lab12.zad02;

import org.montanajr.lab12.state.KontekstStanu;
import org.montanajr.lab12.state.Niewyciszony;

public class Demo {
    public static void main(String[] args) {
        StateContext context = new StateContext();
        context.setLevel(new FirstLevel());
        context.play();
        context.setLevel(new SecondLevel());
        context.play();
        context.lost();
        context.play();


    }
}
