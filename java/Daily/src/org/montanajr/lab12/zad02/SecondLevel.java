package org.montanajr.lab12.zad02;

public class SecondLevel implements Level{
    @Override
    public void play(StateContext stateContext) {
        System.out.println("PLAYING SECOND LEVEL");
    }

    @Override
    public void lost() {
        System.out.println("Przegrane.");
    }
}
