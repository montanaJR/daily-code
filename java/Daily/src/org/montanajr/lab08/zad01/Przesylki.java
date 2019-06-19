package org.montanajr.lab08.zad01;

import java.util.ArrayList;

public class Przesylki {

    private java.util.List<Przesylka> przesylki = new ArrayList<Przesylka>();

    public void dodaj(Przesylka klient)
    {
        przesylki.add(klient);
    }

    public void usun(Przesylka klient)
    {
        przesylki.remove(klient);
    }

    public void wizytuj(Odwiedzajacy odwiedzajacy)
    {
        for(Przesylka e : this.przesylki)
        {
            e.wizytuj(odwiedzajacy);
        }
        System.out.println();
    }
}
