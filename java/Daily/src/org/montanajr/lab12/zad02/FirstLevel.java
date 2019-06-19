package org.montanajr.lab12.zad02;

public class FirstLevel implements Level{
    @Override
    public void play(StateContext stateContext) {
        System.out.println("PLAYING FIRST LEVEL");
    }

    @Override
    public void lost() {
        System.out.println("Przegrane.");
    }
}
